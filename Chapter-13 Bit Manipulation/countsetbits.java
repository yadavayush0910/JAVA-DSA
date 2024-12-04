public class countsetbits {
    public static int countSetBits(int num) {
        int count = 0;
        while (num > 0) {
            // Check if the least significant bit is 1
            if ((num & 1) != 0) {
                count++;
            }
            // Right shift num to check the next bit
            num = num >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBits(16));  // Output will be 1
        System.out.println(countSetBits(7));   // Output will be 3
    }
}
