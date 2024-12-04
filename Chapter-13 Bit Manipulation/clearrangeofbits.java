public class clearrangeofbits {
    public static int clearRangeOfBits(int num, int i, int j) {
        // Create a mask with 1's above bit j
        int a = (~0) << (j + 1);
        
        // Create a mask with 1's below bit i
        int b = (1 << i) - 1;
        
        // Combine the two masks and clear the range of bits
        return num & (a | b);
    }

    public static void main(String[] args) {
        System.out.println(clearRangeOfBits(10, 2, 7)); // Output will be 2
    }
}
