import java.util.Scanner;

public class J019_ps4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Income In Lakhs Per Annum:- ");
        float income = sc.nextFloat();
        float tax = 0;
        if (income <= 2.5f) {
            tax = 0;
        } else if (income > 2.5f && income <= 5.0f) {
            tax = tax + 0.05f * (income - 2.5f);
        } else if (income > 5.0f && income <= 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.20f * (income - 5.0f);
        } else if (income > 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.20f * (10.0f - 5.0f);
            tax = tax + 0.30f * (income - 10.0f);
        }
        System.out.println("The Total Tax Paid By The Employee Is:- " + tax + " Lakhs");
        sc.close();
    }
}