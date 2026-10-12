public class J029_ps6_8 {
    public static void main(String[] args) {
        boolean isSorted = true;
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr = {1, 2, 3, 4, 10, 5, 6, 7, 8, 9};
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}