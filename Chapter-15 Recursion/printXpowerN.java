public class printXpowerN {
    public static int XpowN(int x, int n) {
        if (n == 0) {
            return 1;  // Base case: x^0 is 1
        }
        return x * XpowN(x, n - 1);  // Recursive case: multiply x by the result of x^(n-1)
    }

    public static void main(String[] args) {
        System.out.println(XpowN(2, 10));  // This should print 1024
    }
}
