import java.util.Arrays;
import java.util.Collections;

public class ArraysSort {
    public static void main(String[] args) {
        int arr1[] = {11, 21, 13, 24, 15, 26, 17, 8};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        char arr2[] = {'b', 'B', 'a', 'A'};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        Integer arr3[] = {1, 2, 3, 4, 5, 6};
        Arrays.sort(arr3, Collections.reverseOrder()); // Corrected line
        System.out.println(Arrays.toString(arr3));
    }
}
