public class TilingProblem {
    public static int totalTiles(int n) {
        if (n == 0 || n == 1) {
            return 1;  // Base cases: 1 way to tile a 2x0 or 2x1 board
        }
        int totalWays = totalTiles(n - 1) + totalTiles(n - 2);  // Recursive case
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(totalTiles(4));  // This should print the number of ways to tile a 2x5 board
    }
}
