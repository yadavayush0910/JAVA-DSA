
public class FindSubsets {
    public static void printSubsets(String str , int i , String ans) {
        if(i==str.length()){
            if (ans.length()==0) {
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        printSubsets(str, i+1, ans);
        printSubsets(str, i+1, ans+str.charAt(i));
    }
    public static void main(String[] args) {
        String str="abc";
        printSubsets(str, 0,"");
    }
}
