import java.util.Scanner;

public class J019_ps4_5 {
    public static void main(String[] args) {
        System.out.print("Enter Year:- ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap Year.");
        } else {
            System.out.println("Ordinary Year.");
        }
    }
}