public class CWH_35_ps7_3 {
//     sum(n) = 1 + 2 + 3... + n
//     sum(n) = 1 + 2 + 3... + n - 1 + n
//     sum(n) = sum(n-1) + n
//     sum(3) = 3 + sum(2)
//     sum(3) = 3 + 2 + sum(1)
//     sum(3) = 3 + 2 + 1

    static int sumRec(int n) {
        // Base Condition:-
        if (n == 1) {
            return 1;
        }
        return n + sumRec(n - 1);
    }

    public static void main(String[] args) {
        int c = sumRec(4);
        System.out.println(c);
    }
}