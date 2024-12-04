public class CheckArraySort {
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;  // Base case: Reached the end of the array
        }
        if (arr[i] > arr[i + 1]) {
            return false;  // Found an unordered pair
        }
        return isSorted(arr, i + 1);  // Recursive call to check the next pair
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 64, 51};
        System.out.println(isSorted(arr, 0));  // This should print 'false'
    }
}
