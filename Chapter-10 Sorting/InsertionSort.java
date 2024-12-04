public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int prev = i - 1;
            
            // Shift elements to the right to make room for the current element
            while (prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // Insert the current element at its correct position
            arr[prev + 1] = current;
        }
    }

    public static void main(String[] args) {
        int nums[] = {1, 25, 13, 4, 17, 21, 72};
        insertionSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
