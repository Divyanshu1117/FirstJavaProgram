public class CWH_35_ps7_7 {
    static void pattern2_rec(int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
            pattern2_rec(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        pattern2_rec(n);
    }
}