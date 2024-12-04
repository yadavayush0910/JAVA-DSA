
public class FACTORIAL {
    public static int factIterative(int n) {
        int res=1;
        for(int i=1;i<=n;i++){
                   res*=i;
        }
        return res;
    }
    public static int factRecursive(int n) {
        if(n==0||n==1){
            return 1;
        }
        return n*factRecursive(n-1);
    }
    public static void main(String[] args) {
                     int n=5;
                     System.out.println(factIterative(n));
                     System.out.println(factRecursive(n));
    }
}
