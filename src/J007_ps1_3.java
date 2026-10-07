import java.util.Scanner;

public class J007_ps1_3 {
    public static void main(String[] args) {
        System.out.print("What is your name:- ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + " have a good day!");
    }
}