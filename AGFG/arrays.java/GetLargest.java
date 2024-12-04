public class GetLargest {
    public static int largest(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int secondLargest(int[] arr) {
        int largest = largest(arr); // Get the largest value
        int secondLargest = -1;    // Initialize second largest value

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != largest) { // Skip the largest element
                if (secondLargest == -1 || arr[i] > secondLargest) {
                    secondLargest = arr[i];
                }
            }
        }

        return secondLargest; // Return the second largest element
    }

    public static void main(String[] args) {
        int arr[] = {12, 112, 1, 23, 31, 3, 45, 67, 89, 0, 99, 112, 345, 279};
        System.out.println("Largest is: " + largest(arr));
        System.out.println("Second Largest is: " + secondLargest(arr));
    }
}
