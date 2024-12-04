public class PrefixSum {

    public static void maxSum(int arr[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        // Create the prefix sum array
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Compute the maximum subarray sum
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                // Calculate sum of subarray from i to j
                currsum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                // Update maxsum if the current sum is larger
                if (currsum > maxsum) {
                    maxsum = currsum;
                }
            }
        }

        System.out.println("Maximum Sum: " + maxsum);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        maxSum(arr);
    }
}
