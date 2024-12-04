
public class substring {
    public static String SubString(String str, int si,int ei) {
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
public static void main(String[] args) {
    String s1="Tony Kakkar";
    System.out.println(s1.substring(0,2));
    String ans= SubString("Ayush Yadav", 3, 7);
    System.out.println(ans);
}    
}
