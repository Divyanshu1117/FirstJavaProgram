public class J029_ps6_1 {
    public static void main(String[] args) {
        float[] marks = {45.5f, 67.5f, 63.5f, 99.2f, 100.0f};
        float sum = 0;
        for (float mark : marks) {
            sum = sum + mark;
        }
        System.out.println("The value of sum is: " + sum);
    }
}