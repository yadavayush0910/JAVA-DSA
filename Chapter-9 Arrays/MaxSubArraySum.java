public class MaxSubArraySum {
    public static void maxSubArraySum(int arr[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            // Reset currsum for each new starting index i
            for (int j = i; j < arr.length; j++) {
                currsum = 0;  // Reset current sum for each subarray
                for (int k = i; k <= j; k++) {
                    currsum += arr[k];
                }
                // Update maxsum if the current sum is larger
                if (currsum > maxsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Maximum sum of SubArray: " + maxsum);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        maxSubArraySum(arr);
    }
}
