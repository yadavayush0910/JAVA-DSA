
public class PrintNto1 {
    public static void Nto1(int n) {
        if(n==0)
           return;
        System.out.print(n+" ");
        Nto1(n-1);
    }
    public static void printNto1(int n) {
        if(n==1){
            System.out.print("1");
            return;
        }
        System.out.print(n+" ");
        printNto1(n-1);
        
    }
    public static void main(String[] args) {
        Nto1(10);
        System.out.println();
        printNto1(10);
    }
}
