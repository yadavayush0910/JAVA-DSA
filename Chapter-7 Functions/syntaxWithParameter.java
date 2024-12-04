public class syntaxWithParameter {
    public static int sum(int num1, int num2) { // parameters
        return num1 + num2;
    }

    public static void main(String[] args) {
        int sum = sum(3, 4); // arguments
        System.out.println("Sum is: " + sum);
    }
}
