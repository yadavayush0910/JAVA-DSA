public class FrequenciesinASortedArray {
    public static void frequencies(int[] arr) {
        int n = arr.length;
        int freq = 1; // Initialize frequency for the first element
        
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                freq++; // Increment frequency if the current element is the same as the previous one
            } else {
                System.out.println(arr[i - 1] + " appears " + freq + " times");
                freq = 1; // Reset frequency for the next element
            }
        }
        
        // Print the frequency of the last element
        System.out.println(arr[n - 1] + " appears " + freq + " times");
    }

    public static void main(String[] args) {
        int arr[] = {10, 10, 10, 25, 30, 30, 30,21};
        frequencies(arr);
    }
}
