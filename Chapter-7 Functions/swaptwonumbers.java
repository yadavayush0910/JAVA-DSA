import java.util.Scanner;
public class swaptwonumbers {
    public static void swap(int a, int b) {
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("Inside Swap Function");
        System.out.println("a:"+a);
        System.out.println("b:"+b);

    }
    public static void main(String[] args) {
        Scanner Sc= new  Scanner(System.in);
        System.out.print("Enter first Number:");
        int num1=Sc.nextInt();
        System.out.print("Enter second Number:");
        int num2=Sc.nextInt();
        System.out.println("Before swap: ");
        System.out.println("a:"+num1);
        System.out.println("b:"+num2);
        swap(num1, num2);
        System.out.println("After swap: ");
        System.out.println("a:"+num1);
        System.out.println("b:"+num2);

    }
}
