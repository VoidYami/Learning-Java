import java.util.Calendar;
import java.util.GregorianCalendar;

public class calender_class {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE));

        GregorianCalendar cal = new GregorianCalendar();
        
        System.out.println(cal.isLeapYear(2020));
    }
}
