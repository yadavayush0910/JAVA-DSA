public class MajorityElement {
    public static int majority(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j])
                   count++;
            }
            if(count>arr.length/2)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={20,30,40,50,50,50,50};
        System.out.println(majority(arr));
    }
}
