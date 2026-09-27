public class CWH_25_ps5_7 {
    public static void main(String[] args) {
        int n = 4;
        int i = n;
        while (i > 0) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}