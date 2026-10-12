public class J029_ps6_6 {
    public static void main(String[] args) {
        int[] arr = {1, 21, 3, 455, 5, 34, 67, 999};
        int max = arr[0];
//        int max = Integer.MAX_VALUE;
        for (int element : arr) {
            if (element > max) {
                max = element;
            }
        }
        System.out.println("The value of the maximum element in this array is: " + max);
//        System.out.println(Integer.MAX_VALUE);
    }
}