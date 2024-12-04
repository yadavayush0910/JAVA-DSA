import java.util.Arrays;
import java.util.Collections;

public class InBuiltSort {
    public static void main(String[] args) {
        int arr[] = {11, 2, 3, 4, 5, 6, 7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Integer arr1[] = {11, 2, 3, 4, 5, 6, 7};
        Arrays.sort(arr1, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr1));
    }
}
