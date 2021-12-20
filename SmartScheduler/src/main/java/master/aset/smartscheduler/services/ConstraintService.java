package master.aset.smartscheduler.services;

import master.aset.smartscheduler.entities.calendar.Calendar;
import org.chocosolver.solver.Model;
import org.chocosolver.solver.Solution;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.search.loop.monitors.IMonitorSolution;
import org.chocosolver.solver.variables.IntVar;

import java.util.List;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        /*Model model = new Model("Scheduler");

        IntVar a = model.intVar("a", 0, 2, false);
        IntVar b = model.intVar("b", 0, 2, false);
        IntVar c = model.intVar("c", 0, 2, false);
        model.arithm(a, "+", b, "=", c).post();

// create an object that will store the best solutions and remove dominated ones
        ParetoOptimizer po = new ParetoOptimizer(Model.MAXIMIZE, new IntVar[]{a,b});
        Solver solver = model.getSolver();
        solver.plugMonitor(po);

// optimization
        while(solver.solve());

// retrieve the pareto front
        List<Solution> paretoFront = po.getParetoFront();
        System.out.println("The pareto front has "+paretoFront.size()+" solutions : ");
        for(Solution s:paretoFront) {
            System.out.println("a = " + s.getIntVal(a) + " and b = " + s.getIntVal(b));
        }*/


        /*int[] nbItems = new int[]{5, 2, 6, 7}; // number of items for each type
        int[] weights = new int[]{5, 8, 7, 8}; // weight of an item for each type
        int[] lipids  = new int[]{5, 9, 8, 1}; // quantity of lipids of the item
        int[] glucose = new int[]{9, 5, 7, 32}; // quantity of glucose of the item

        Model model = new Model("ParetoKnapsack");

        // For each type, we create a variable for the number of occurrences
        IntVar[] occurrences = new IntVar[nbItems.length];
        for (int i = 0; i < nbItems.length; i++) {
            occurrences[i] = model.intVar(0, nbItems[i]);
        }

        // Total weight of the solution.
        IntVar weight = model.intVar(0, 80);
        // Total of lipids
        IntVar totalLipids = model.intVar(0, 200);
        // Total of glucose
        IntVar totalGlucose = model.intVar(0, 200);

        // We add two knapsack constraints to the solver
        // Beware : call the post() method to save it
        model.knapsack(occurrences, weight, totalLipids, weights, lipids).post();
        model.knapsack(occurrences, weight, totalGlucose, weights, glucose).post();

        // Optimise independently two variables using the Pareto optimizer
        List<Solution> solutions = model.getSolver().findParetoFront(new IntVar[]{totalLipids, totalGlucose},Model.MAXIMIZE);
        for (Solution solution : solutions) {
            System.out.println("-----------------------------------");
            System.out.println("W: " + solution.getIntVal(weight) + "\t G:" + solution.getIntVal(totalGlucose) + "\t L: " + solution.getIntVal(totalLipids));
            System.out.println("Strawberry jam: " + solution.getIntVal(occurrences[0]));
            System.out.println("Bananas: " + solution.getIntVal(occurrences[1]));
            System.out.println("Apples: " + solution.getIntVal(occurrences[2]));
            System.out.println("Honey: " + solution.getIntVal(occurrences[3]));
        }
        System.out.println("There are "+solutions.size()+" Pareto-optimal solutions");*/


        /* ---------------------------------------------------------------------------------------------------------------------------------------------------- */

        // Smart scheduler

        // numarul de sloturi intr-o zi: 08:00 - 20:00
        int daySlots = 12;

        // numarul de zile in care lucrez
        int workDays = 6;

        // vom avea un dictionar care sa ne zica ce task este asociat fiecarui numar
        // task-urile mele in aceasta saptamana
        int[] tasks = { 1, 2, 3, 4 };

        // durata fiecarui task in minute
        int[] durations = { 30, 120, 180, 60 };

        int[] occurrences = {
                0, 18, -1, -1, -1,
                0, 14, -1, -1, -1,
                14, -1, -1, -1, -1,
                1, 3, 13, 17, 22
        };

        int[][] occurrencesMatrix = {
                {0, 18, -1, -1, -1},
                {0, 14, -1, -1, -1},
                {14, -1, -1, -1, -1},
                {1, 3, 13, 17, 22}
        };

        Model model = new Model("Scheduler");

        IntVar[] tasksVar = model.intVarArray("tasks", 4, tasks);
        IntVar[] durationsVar = model.intVarArray("durations", 4, durations);
        IntVar[][] occVar = model.intVarMatrix("occurrences", tasks.length, 5, occurrences);

        IntVar[] solution = IntStream
                .range(0, 4)
                .mapToObj(i -> model.intVar("task #" + i, occurrencesMatrix[i]))
                .toArray(IntVar[]::new);

        model.allDifferent(solution).post();

        for(int i = 0; i < solution.length; i++) {
            model.arithm(solution[i], "!=", model.intVar(-1)).post();
        }

        for(int i = 0; i < tasks.length - 1; i++) {
            for(int j = i + 1; j < tasks.length; j++) {
                model.or(model.arithm(solution[j], ">=", solution[i], "+", durationsVar[i]),
                        model.arithm(solution[j], "+" , durationsVar[j], "<=", solution[i])).post();
            }
        }

        System.out.println(model.getSolver().solve());

            for (int i = 0; i < tasks.length; i++) {
                System.out.printf("%s takes place at %d \n",
                        solution[i].getName(),
                        solution[i].getValue());
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
