public class DiagonalSum {
    public static void diagonalSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                }
                if (i + j == matrix.length - 1 && i != j) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("The sum of the diagonals is: " + sum);
    }
    public static void  diagonalMatrix(int matrix[][]) {
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            
            //pd
            sum+=matrix[i][i];
            //sd
            if(i!=matrix.length-i-1){
                sum+=matrix[i][matrix.length-i-1];
            }

        }
        System.out.println("Sum is :"+ sum);
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        diagonalSum(matrix);
        diagonalMatrix(matrix);
    }
}
