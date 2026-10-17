import java.util.Calendar;

public class J098_calendar_class {
    public static void main(String[] args) {
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());

//        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID());
    }
}