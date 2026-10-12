public class J029_ps6_2 {
    public static void main(String[] args) {
        float[] marks = {45.5f, 67.5f, 63.5f, 99.2f, 100.0f};
        float num = 63.5f;
        boolean isInArray = false;
        for (float mark : marks) {
            if (mark == num) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("The value is present in the array");
        } else {
            System.out.println("The value is not present in the array");
        }
    }
}