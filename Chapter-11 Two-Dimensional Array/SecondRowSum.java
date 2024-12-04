public class SecondRowSum {
    public static int sumofsecondrow(int matrix[][]) {
        int sum=0;
        for(int i=0;i<matrix[1].length;i++){
               sum+=matrix[1][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {
            {4, 7, 8},
            {11,4,3},
            {8, 8, 7}
        };
        System.out.println(sumofsecondrow(matrix));
    }
}
