public class CWH_35_ps7_10 {
    static int sum_iterative(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("The sum of first " + n + " natural numbers is: " + sum_iterative(n));
    }
}