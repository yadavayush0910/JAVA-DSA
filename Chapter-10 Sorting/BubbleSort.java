public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int nums[]={1,25,13,4,17,21,72};
        bubbleSort(nums);
        for(int i=0;i<nums.length;i++){
         System.out.print(nums[i]+" ");   
        }
    }
}
