public class CWH_25_ps5_5 {
    public static void main(String[] args) {
        // What Is Factorial n = n * n - 1 * n - 2 ...... 1 :-
        // 5! = 5 * 4 * 3 * 2 * 1 = 120.
        int n = 5;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial Of " + n + " is : " + factorial);
    }
}