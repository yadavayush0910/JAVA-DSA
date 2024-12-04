
public class RecursionRopeCutting {
    // Method to find the maximum number of pieces we can cut the rope into
    public static int maxpieces(int n, int a, int b, int c) {
        // Base case: if length becomes zero, return 0 as a valid division is found
        if (n == 0) return 0;
        // Base case: if length becomes negative, return -1 as it’s not possible to divide further
        if (n < 0) return -1;

        // Recursive case: try to cut the rope with length `a`, `b`, and `c`
        int res = Math.max(
            Math.max(maxpieces(n - a, a, b, c), maxpieces(n - b, a, b, c)),
            maxpieces(n - c, a, b, c)
        );

        // If no valid pieces could be made, return -1
        if (res == -1) return -1;

        // Otherwise, add 1 to the result for the current piece
        return res + 1;
    }

    public static void main(String[] args) {
        System.out.println(maxpieces(5, 2, 5, 1)); // Test case
    }
}
