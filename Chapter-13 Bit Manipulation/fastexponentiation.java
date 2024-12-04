public class fastexponentiation {
    public static int fastexponentiation(int num, int pow) {
        int ans = 1;
        int a = num;
        while (pow > 0) {
            // If the current power is odd, multiply ans by a
            if ((pow & 1) != 0) {
                ans = ans * a;
            }
            // Square the base
            a = a * a;
            // Divide the power by 2
            pow = pow >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastexponentiation(5, 3)); // Output will be 125
    }
}
