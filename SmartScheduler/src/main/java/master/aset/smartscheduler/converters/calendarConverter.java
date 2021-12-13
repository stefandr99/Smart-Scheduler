package master.aset.smartscheduler.converters;

import javax.el.ValueExpression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import master.aset.smartscheduler.entities.calendar.Calendar;
import master.aset.smartscheduler.managedBeans.ScheduleJava8View;

@FacesConverter(value="calendarConverter")
public class calendarConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        ValueExpression vex = context.getApplication().getExpressionFactory()
                        .createValueExpression(context.getELContext(), "#{scheduleJava8View}", ScheduleJava8View.class);
        ScheduleJava8View java8View = (ScheduleJava8View)vex.getValue(context.getELContext());
        return java8View.getCalendar(value);
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value instanceof Calendar) {
            return ((Calendar) value).getName();
        } else {
            return "";
        }
    }
}
