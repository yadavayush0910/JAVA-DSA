public class updateithbit {
    public static int updateIthBit(int n, int i, int newbit) {
        // Create the bitmask by inverting the bit at position i
        int bitmask = ~(1 << i);
        
        // Clear the ith bit
        n = n & bitmask;
        
        // Set the ith bit to newbit
        n = n | (newbit << i);
        
        return n;
    }

    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1)); // Output will be 14
    }
}
