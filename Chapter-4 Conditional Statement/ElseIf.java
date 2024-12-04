public class ElseIf {
public static void main(String[] args) {
    int a=10;
    int b=10;
    if(a>b){
        System.out.println("Largest is:"+a);
    }
    else if(a==b){
        System.out.println("Both are equal");
    }
    else{
        System.out.println("Largest is:"+b);
    }
}    
}
