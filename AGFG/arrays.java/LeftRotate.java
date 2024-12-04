public class LeftRotate {
    public static void Lrotate(int[] arr) {
        int n=arr.length;
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }
    public static void LrotateByD(int[] arr,int d) {
        for(int i=0;i<d;i++){
            Lrotate(arr);
        }
    }
    public static void main(String[] args) {
        int arr[]={8,5,0,10,0,20};
        Lrotate(arr);
        LrotateByD(arr,2);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
