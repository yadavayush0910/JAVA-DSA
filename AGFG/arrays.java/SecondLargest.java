
import java.lang.reflect.Array;

public class SecondLargest {
    public static int secondLargest(int []arr) {
        int res=-1;
        int largest=0;
        for(int i=0;i<arr.length;i++){
               if(arr[i]>arr[largest]){
                res=largest;
                largest=i;
               }
               else if(arr[i]!=arr[largest]){
                if(res==-1||arr[i]>arr[res]){
                    res=i;
                }
               }
        }
        int secondlarge=arr[res];
        return secondlarge;
    }
    public static void main(String[] args) {
        int arr[]={12, 112, 1, 23, 31, 3, 45, 67, 89, 0, 99, 112, 345, 279};
        System.out.println(secondLargest(arr));
    }
}
