public class LinearSearch {
    public static int search(int []arr, int key) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={11,2,3,14,15,1,5,23,91};
        int ans=search(arr, 51);
        System.out.println(ans);
    }
}
