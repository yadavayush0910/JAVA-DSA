public class QuickSort {
    public static void sort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        // Last element
        int pidx = partition(arr, si, ei);
        sort(arr, si, pidx - 1); // Left
        sort(arr, pidx + 1, ei); // Right
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // To make place for elements smaller than pivot
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        // Swap pivot
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 8, 2, 5};
        sort(arr, 0, arr.length - 1);
        print(arr);
    }
}
 