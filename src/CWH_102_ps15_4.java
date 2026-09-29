import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CWH_102_ps15_4 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");

        String myDate = dt.format(dtf);
        System.out.println(myDate);
    }
}