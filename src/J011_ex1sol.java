import java.util.Scanner;

public class J011_ex1sol {
    public static void main(String[] args) {
        System.out.println("Please Enter Your Marks:- ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your English Marks:- ");
        int a = sc.nextInt();
        System.out.print("Enter Your Computer Marks:- ");
        int b = sc.nextInt();
        System.out.print("Enter Your Sanskrit Marks:- ");
        int c = sc.nextInt();
        System.out.print("Enter Your Hindi Marks:- ");
        int d = sc.nextInt();
        System.out.print("Enter Your G.K Marks:- ");
        int e = sc.nextInt();
        int sum = a + b + c + d + e;
        double percentage = (sum / 500.0) * 100;
        System.out.print("This Is Your Percentage:- ");
        System.out.println(percentage);
    }
}