package master.aset.smartscheduler.services;

import master.aset.smartscheduler.entities.calendar.Calendar;
import master.aset.smartscheduler.entities.calendar.CalendarEntry;
import master.aset.smartscheduler.repositories.interfaces.ICalendarEntryRepository;
import master.aset.smartscheduler.repositories.interfaces.ICalendarRepository;
import org.chocosolver.solver.Model;
import org.chocosolver.solver.variables.IntVar;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ConstraintService {
    @Inject
    ICalendarEntryRepository calendarEntryRepository;

    @Inject
    ICalendarRepository calendarRepository;

    public Calendar mergeCalendars(int[] ids) {
        List<CalendarEntry> calendarEntries = new ArrayList<>();
        Calendar finalCalendar = new Calendar();

        for(int i = 0 ; i < ids.length; i++) {
            Calendar calendar = calendarRepository.getById(ids[i]);

            calendarEntries.add(calendarEntryRepository.getByCalendar(calendar));
        }



        return null;
    }

    public static void main(String[] args) {
        // Smart scheduler

        // task-urile mele in aceasta saptamana
        int[] tasks = { 1, 2, 3, 4 };

        // durata fiecarui task in minute
        int[] durations = { 30, 120, 180, 60 };

        int[][] occurrencesMatrix = {
                {0 * 60, 18 * 60},
                {0 * 60, 14 * 60},
                {14 * 60},
                {1 * 60, 3 * 60, 13 * 60, 17 * 60, 22 * 60}
        };

        Model model = new Model("Scheduler");

        IntVar[] solution = IntStream
                .range(0, 4)
                .mapToObj(i -> model.intVar("task #" + i, occurrencesMatrix[i]))
                .toArray(IntVar[]::new);

        model.allDifferent(solution).post();

        for(int i = 0; i < tasks.length - 1; i++) {
            for(int j = i + 1; j < tasks.length; j++) {
                model.or(model.arithm(solution[j], ">=", solution[i], "+", durations[i]),
                        model.arithm(solution[i], ">=" , solution[j], "+", durations[j])).post();
            }
        }

        System.out.println(model.getSolver().solve());

        for (int i = 0; i < tasks.length; i++) {
            System.out.printf("%s takes place at %d \n",
                    solution[i].getName(),
                    solution[i].getValue() / 60);
        }

        /**
         * solution[i] != -1
         * solution[i] ia exact o valoare din occVar[i]
         * atLeastNValues(occ[i], 1, false) ? - probabil ca nu
         * atMostNValues(occ[i], 1, false) ? - probabil ca nu
         * solution[i] = occ[i][j], exista j - cumva satisfacut
         *
         *  pentru orice i, j in [0, 3] atunci [solution[i], solution[i] + duration[i]] not intersect [solution[j], solution[j] + duration[j]]
         *
         *  solution[j] >= solution[i] + duration[j] OR solution[j] + duration[j] <= solution[i]
         */
    }
}
