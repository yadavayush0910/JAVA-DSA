
public class internmethod {
 public static void main(String[] args) {
     String s1="Ayush";
     String s2= new String("Ayush");
     System.out.println(s1==s2);
     String s3=s2.intern();
     System.out.println(s1==s3);
 }   
}
