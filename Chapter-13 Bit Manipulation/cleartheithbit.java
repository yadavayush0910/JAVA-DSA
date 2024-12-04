public class cleartheithbit {
    public static void main(String[] args) {
        int n = 12; // The number to clear the bit from
        int i = 2;  // The bit position to clear (0-based index)
        
        // Create the bitmask by inverting the bit at position i
        int bitmask = ~(1 << i);
        
        // Clear the ith bit using the bitmask
        System.out.println(n & bitmask); // Output will be 8
    }
}
