
public class comparestoignorecase {
    public static void main(String[] args) {
        String str1="Hello World";
        String str2="hello world";
        if(str1.compareToIgnoreCase(str2)==0){
            System.out.println("Equal ignoring cases");
        }
        else{
            System.out.println("Not equal");
        }
    }
}
