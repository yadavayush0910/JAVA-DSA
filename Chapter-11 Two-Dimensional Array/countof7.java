public class countof7 {
    public static int countof7(int matrix[][]) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 7) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {4, 7, 8},
            {8, 8, 7}
        };
        System.out.println(countof7(matrix)); // Output will be 2
    }
}
