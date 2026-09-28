public class CWH_96_date_and_time {
    public static void main(String[] args) {

        long milliseconds = System.currentTimeMillis();

        System.out.println("Milliseconds: " + milliseconds);

        long seconds = milliseconds / 1000;
        System.out.println("Seconds: " + seconds);

        long minutes = seconds / 60;
        System.out.println("Minutes: " + minutes);

        long hours = minutes / 60;
        System.out.println("Hours: " + hours);

        long days = hours / 24;
        System.out.println("Days: " + days);

        long years = days / 365;
        System.out.println("Years: " + years);
    }
}