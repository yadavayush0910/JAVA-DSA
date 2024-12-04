public class getithbit {
    public static void main(String[] args) {
        int n = 10; // The number to check
        int i = 3;  // The bit position to check (0-based index)
        
        // Shift 1 to the left by i positions
        int bit = 1 << i;
        
        // Perform bitwise AND to isolate the bit at position i
        int res = n & bit;
        
        // If the result is 0, the bit is 0; otherwise, the bit is 1
        if (res == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }
}
