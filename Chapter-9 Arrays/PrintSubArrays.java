public class PrintSubArrays {
    public static void printSubArray(int arr[]) {
        int ts = 0;  // Total subarrays counter
        // Outer loop for the starting point of subarrays
        for(int i = 0; i < arr.length; i++) {
            // Middle loop for the end point of subarrays
            for(int j = i; j < arr.length; j++) {
                // Inner loop to print the subarray from i to j
                for(int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();  // Move to the next line after printing each subarray
                ts++;  // Increment subarray counter
            }
            System.out.println();  // Separate different starting points with an empty line
        }
        System.out.println("Total Subarrays: " + ts);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        printSubArray(arr);
    }
}
