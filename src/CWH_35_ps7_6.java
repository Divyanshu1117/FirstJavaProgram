public class CWH_35_ps7_6 {
    static float average(int x, int... arr) {
        int sum = x;
        for (int a : arr) {
            sum += a;
        }
        int count = arr.length + 1;
        return (float) sum / count;
    }

    public static void main(String[] args) {
        System.out.println("The average of 1 is: " + average(1));
        System.out.println("The average of 4 and 5 is: " + average(4, 5));
        System.out.println("The average of 4, 3 and 5 is: " + average(4, 3, 5));
    }
}