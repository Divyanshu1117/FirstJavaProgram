public class J029_ps6_7 {
    public static void main(String[] args) {
        int[] arr = {1, 21, 3, 455, 5, 34, 67, 999};
        int min = arr[0];
//        int min = Integer.MIN_VALUE;
        for (int element : arr) {
            if (element < min) {
                min = element;
            }
        }
        System.out.println("The value of the minimum element in this array is: " + min);
//        System.out.println(Integer.MIN_VALUE);
    }
}