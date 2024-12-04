public class poweroftwo {
    public static boolean isPowerOfTwo(int num) {
        // Ensure the number is greater than 0 and meets the condition
        return num > 0 && ((num & (num - 1)) == 0);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(32)); // Output will be true
        System.out.println(isPowerOfTwo(18)); // Output will be false
        System.out.println(isPowerOfTwo(0));  // Output will be false
    }
}
