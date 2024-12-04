public class MinimumGroupFlipsToMakeSum {
    public static void flips(int[] arr) {
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                if(arr[i]!=arr[0]){
                    System.out.print("From "+i+" to");
                }
                else{
                    System.out.print(i-1+"\n");
                }
            }
        }
        if(arr[arr.length-1]!=arr[0]){
            System.out.println("Flip - "+(arr.length-1));
        }
    }
    public static void main(String[] args) {
        int arr[]={0,0,1,1,0,0,1,1,0,1};
        flips(arr);
    }
}
