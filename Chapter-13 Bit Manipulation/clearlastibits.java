public class clearlastibits {
    public static int clearLastIbits(int n, int i) {
        // Shift ~0 (which is all 1's) left by i positions to create the bitmask
        int bitmask = (~0) << i;
        
        // AND n with the bitmask to clear the last i bits
        return n & bitmask;
    }

    public static void main(String[] args) {
        System.out.println(clearLastIbits(12, 2)); // Output will be 8
    }
}
