public class KadaneAlgorithm {

    // This method handles arrays with positive elements
    public static void maxsum(int arr[]) {
        int cs = 0;  // Current sum
        int ms = Integer.MIN_VALUE;  // Maximum sum

        for (int i = 0; i < arr.length; i++) {
            cs = cs + arr[i];

            if (cs < 0) {
                cs = 0;  // Reset the current sum if it becomes negative
            }

            ms = Math.max(cs, ms);  // Update the maximum sum
        }

        System.out.println("Maximum sum for mixed array is: " + ms);
    }

    // This method handles arrays with all negative numbers
    public static void maxsumAllNegative(int arr[]) {
        int cs = arr[0];  // Start current sum with the first element
        int ms = arr[0];  // Start maximum sum with the first element

        for (int i = 1; i < arr.length; i++) {
            cs = Math.max(arr[i], arr[i] + cs);  // Either continue with the current sum or start fresh
            ms = Math.max(cs, ms);  // Update the maximum sum
        }

        System.out.println("Maximum sum for all negative array is: " + ms);
    }

    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        maxsum(arr);  // Handles arrays with both positive and negative values

        int arr1[] = {-1, -2, -3, -4, -5};
        maxsumAllNegative(arr1);  // Handles arrays with all negative values
    }
}
