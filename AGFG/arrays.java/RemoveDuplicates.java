public class RemoveDuplicates {
    public static int removeDuplicate(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;

        // Create a temporary array to store unique elements
        int[] temp = new int[n];
        temp[0] = arr[0];
        int res = 1; // Pointer for the result array

        for (int i = 1; i < n; i++) {
            if (temp[res - 1] != arr[i]) {
                temp[res] = arr[i];
                res++;
            }
        }

        // Copy the unique elements back to the original array
        for (int i = 0; i < res; i++) {
            arr[i] = temp[i];
        }

        return res;
    }
      
    public static int efficient(int[] arr) {
        int res=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[res-1]){
                  arr[res]=arr[i];
                  res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 30, 30, 30, 30, 30};
        // int length = removeDuplicate(arr);
                int length = efficient(arr);

        System.out.println("Number of unique elements: " + length);
        
        // Print the array with unique elements
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
