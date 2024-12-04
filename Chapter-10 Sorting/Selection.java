public class  Selection{
    public static void selectionSort(int nums[]) {
        for (int i=0;i<nums.length-1; i++) {
            int minidx=i;
            for(int j=i+1;j<nums.length;j++){
                   if(nums[minidx]>nums[j]){
                    minidx=j;
                   }
            }
            int temp=nums[minidx];
            nums[minidx]=nums[i];
            nums[i]=temp;
        }
    }
    public static void main(String[] args) {
        int nums[]={5,2,1,4,12,8};
        selectionSort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}