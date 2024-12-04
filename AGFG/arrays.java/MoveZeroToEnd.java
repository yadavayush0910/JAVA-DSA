public class MoveZeroToEnd {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void movezerotoend(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]!=0){
                        swap(arr,i,j);
                    }
                }
            }
        }
    }
    public static void efficient(int[] arr1) {
        int count=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=0){
               swap(arr1, i, count);
               count++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={8,5,0,10,0,20};
        movezerotoend(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        int arr1[]={0,5,0,10,0,0};
        efficient(arr1);
        System.out.println("\nNew Array:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }

    }
}
