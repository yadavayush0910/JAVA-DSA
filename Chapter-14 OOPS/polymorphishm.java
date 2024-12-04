public class polymorphishm {
 public static void main(String[] args) {
     Calculator c1= new Calculator();
     System.out.println(c1.sum(2, 3));
     System.out.println(c1.sum(2.5f, 3.6f));
     System.out.println(c1.sum(2, 3,5));

 }   
}
//Compile time Poly Method overloading
class Calculator{

    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b,int c){
        return a+b+c;
    }
}
