public class PrintXpowerNoptimized {
    public static int optimizedXtoN(int x, int n) {
        if (n == 0) {
            return 1;  // Base case: x^0 is 1
        }
        int halfpower = optimizedXtoN(x, n / 2);  // Recursive call for half the exponent
        int halfpowersq = halfpower * halfpower;  // Square the result of the half power
        
        if (n % 2 != 0) {  // If n is odd, multiply by x once more
            halfpowersq = x * halfpowersq;
        }
        return halfpowersq;
    }

    public static void main(String[] args) {
        System.out.println(optimizedXtoN(2, 10));  // This should print 1024
    }
}
