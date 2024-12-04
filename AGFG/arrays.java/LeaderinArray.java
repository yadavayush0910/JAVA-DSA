public class LeaderinArray {
    public static void leader(int[] arr) {
            
        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>=arr[i]){
                    flag=true;
                    break;
                }
            }
            if(flag==false)
            System.out.print(arr[i]+" ");
        }
    }
    public static void leadereff(int[] arr) {
        int n=arr.length;
        int curr_leader=arr[n-1];
        System.out.print("\n"+curr_leader+" ");
        for(int i=n-2;i>=0;i--){
            if(arr[i]>curr_leader){
                curr_leader=arr[i];
                System.out.print(curr_leader+" ");
            }
        }


    }
    public static void main(String[] args) {
        int arr[]={7,10,4,10,6,5,2};
        leader(arr);
        leadereff(arr);
    }
}
