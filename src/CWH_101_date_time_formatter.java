import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CWH_101_date_time_formatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now(); // This is the date and time:-
        System.out.println(dt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss -- E H:m a"); // This is the format:-
        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_DATE;

//        String MyDate = dt.format(dtf); // Creating date string using date and time formatter:-
        String MyDate = dt.format(dtf2);

        System.out.println(MyDate);
    }
}