public class ArrayInsert {
    public static int insert(int[] arr, int n, int x, int cap, int pos) {
        if (n == cap) { // If the array is already full, return the current size
            return n;
        }

        int idx = pos - 1; // Convert position to 0-based index

        // Shift elements to the right from the position
        for (int i = n - 1; i >= idx; i--) {
            arr[i + 1] = arr[i];
        }

        arr[idx] = x; // Insert the new element at the specified position

        return n + 1; // Return the updated size of the array
    }

    public static void main(String[] args) {
        int cap = 10; // Capacity of the array
        int[] arr = new int[cap];
        int n = 5; // Current size of the array

        // Initialize the array with some values
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int x = 99; // Element to be inserted
        int pos = 3; // Position where the element should be inserted (1-based index)

        n = insert(arr, n, x, cap, pos); // Call the insert function

        // Print the updated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
