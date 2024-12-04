public class LastOccurence {
    public static int lastOccurence(int arr[], int i, int key) {
        if (i < 0) {
            return -1;  // Base case: key not found
        }
        if (arr[i] == key) {
            return i;  // Found the last occurrence of the key
        }
        return lastOccurence(arr, i - 1, key);  // Recursive call to check the previous element
    }

    public static void main(String[] args) {
        int arr[] = {12, 12, 12, 11, 10, 9, 8};
        System.out.println(lastOccurence(arr, arr.length - 1, 12));  // This should print '2'
    }
}
