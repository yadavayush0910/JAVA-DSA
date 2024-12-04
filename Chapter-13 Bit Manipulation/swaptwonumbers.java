public class swaptwonumbers {
    public static void swap(int num1, int num2) {
        // Swap using XOR
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("Inside swap method:");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }

    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        swap(num1, num2);
        System.out.println("After swap method in main:");
        System.out.println("num1: " + num1);  // num1 is still 2
        System.out.println("num2: " + num2);  // num2 is still 3
    }
}
