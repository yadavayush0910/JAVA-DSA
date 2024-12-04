public class LargestInArray {
public static int LargestSearch(int arr[]) {
    int largest=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++)
    {
               if(arr[i]>largest)
               {
                largest=arr[i];
               }
    }
    return  largest;
}    
public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,78,9};
    System.out.println(LargestSearch(arr));
}
}
