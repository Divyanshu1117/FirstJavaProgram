import java.util.Scanner;

public class CWH_19_ps4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Income In Lakhs Per Annum:-");
        float tax = 0;
        float income = sc.nextFloat();
        if (income <= 2.5) {
            tax = tax + 0;
        } else if (income > 2.5f && income <= 5f) {
            tax = tax + 0.05f * (income - 2.5f);
        } else if (income > 5f && income <= 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.02f * (income - 5f);
        } else if (income > 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.02f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println("The Total Tax Paid By The Employee Is:- " + tax);
    }
}