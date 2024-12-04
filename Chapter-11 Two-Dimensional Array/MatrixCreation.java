import java.util.Scanner;

public class MatrixCreation {

    public static boolean search(int matrix[][], int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Found at: (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get matrix dimensions from user
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        // Initialize the matrix with the given dimensions
        int matrix[][] = new int[rows][cols];

        // Input elements in the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element for position (" + i + "," + j + "): ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Display the matrix
        System.out.println("\nThe matrix you entered is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Prompt the user to enter a target value to search for
        System.out.print("Enter the target value to search for: ");
        int target = sc.nextInt();

        // Search for the target in the matrix
        if (!search(matrix, target)) {
            System.out.println("Target not found in the matrix.");
        }
    }
}
