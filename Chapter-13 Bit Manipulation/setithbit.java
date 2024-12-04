public class setithbit {
    public static int setTheIthBit(int n, int i) {
        return n | (1 << i);
    }

    public static void main(String[] args) {
        System.out.println(setTheIthBit(10, 2)); // Output will be 14
    }
}
