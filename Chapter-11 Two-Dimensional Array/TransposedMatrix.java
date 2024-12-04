public class TransposedMatrix {
    public static void transposeOfAMatrix(int matrix[][]) {
        int m = matrix.length;
        int n= matrix[0].length;
        int transposed[][] = new int[m][n];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                transposed[i][j]=matrix[j][i];
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=transposed[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int [][] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        transposeOfAMatrix(matrix);
    }
}
