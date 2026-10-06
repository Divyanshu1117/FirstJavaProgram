import java.util.Scanner;

public class J005_taking_input {
    public static void main(String[] args) {
        System.out.println("Taking Input From The User:-");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1:- ");
        int a = sc.nextInt();
        System.out.print("Enter Number 2:- ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The Sum of Two Number Is:- " + sum);

//        System.out.print("Enter Number 1:- ");
//        float a = sc.nextFloat();
//        System.out.print("Enter Number 2:- ");
//        float b = sc.nextFloat();
//        float sum = a + b;
//        System.out.println("The Sum Of Two Number Is:- " + sum);

//        boolean b1 = sc.hasNextInt();
//        System.out.print(b1);

//        String str = sc.next();
//        String str = sc.nextLine();
//        System.out.print(str);
    }
}