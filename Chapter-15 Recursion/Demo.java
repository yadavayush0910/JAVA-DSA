public class Demo {
    static void fun1(int n){
        if(n==0)
           return;
        System.out.println("GFG-"+n);
        fun1(n-1);
       
    }
    public static void main(String[] args) {
        fun1(2);
    }
}
