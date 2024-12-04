
import java.util.Arrays;


public class anagramcheck {
    public static boolean  checkanagram(String str1 , String str2) {
        if(str1.length()!=str2.length())
        {
            return false;
        }
        char chararr1[]=str1.toCharArray();
        char chararr2[]=str2.toCharArray();
        Arrays.sort(chararr1);
        Arrays.sort(chararr2);
        return (Arrays.equals(chararr1, chararr2));
    }
    public static void main(String[] args) {
         System.out.println(checkanagram("racee", "care"));
    }
}
