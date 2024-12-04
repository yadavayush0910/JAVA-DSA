public class MaximumSubarraySum {
    // Brute-force approach
    public static int maxsum(int[] arr) {
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int curr = 0;
            for (int j = i; j < arr.length; j++) {
                curr = curr + arr[j];
                res = Math.max(res, curr);
            }
        }
        return res;
    }

    // Kadane's Algorithm
    public static int kadane(int[] arr) {
        int res = arr[0]; // Initialize the result with the first element
        int maxEnding = arr[0]; // Initialize maxEnding with the first element
        for (int i = 1; i < arr.length; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]); // Extend or start new subarray
            res = Math.max(res, maxEnding); // Update the result with the max found
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {-3, 8, -2, 4, -5, 6}; // Input array
        System.out.println("Maximum Subarray Sum (Brute-force): " + maxsum(arr));
        System.out.println("Maximum Subarray Sum (Kadane's Algorithm): " + kadane(arr));
    }
}
