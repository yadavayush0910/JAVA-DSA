public class IfArrayIsSorted {
    public static boolean isSorted(int []arr) {
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1])
                     return false;
        }
        return  true;
    }
    public static void main(String[] args) {
        int arr[]={10,20,15,20,30,40};
        System.out.println(isSorted(arr));
    }
}
