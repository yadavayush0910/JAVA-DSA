
import java.util.Stack;



public class ReverseAstring {
    public static String reverse(String str) {
        Stack<Character>s=new Stack<>();
        int i=0;
        while(i<str.length())
        {
            char ch = str.charAt(i);
            s.push(ch);
            i++;
        }
        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty()){
            char curr=s.pop();
            sb.append(curr);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="ayush Yadav";
        System.out.println(reverse(str));
    }
}
