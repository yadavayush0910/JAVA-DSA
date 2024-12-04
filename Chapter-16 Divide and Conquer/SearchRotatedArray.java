public class SearchRotatedArray {
    public static int search(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1; // Base case: target not found
        }

        int mid = si + (ei - si) / 2;
        if (arr[mid] == tar) {
            return mid;
        }

        // Mid on L1 (left sorted part)
        if (arr[si] <= arr[mid]) {
            // Case a: target in the left sorted part
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            } else {
                // Case b: target in the right part
                return search(arr, tar, mid + 1, ei);
            }
        } 
        // Mid on L2 (right sorted part)
        else {
            // Case c: target in the right sorted part
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else {
                // Case d: target in the left part
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0; // Output -> 4
        int tarIdx = search(arr, target, 0, arr.length - 1);
        System.out.println(tarIdx);
    }
}
