import java.util.ArrayList;

public class SearchInRotated {
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int n = list.size();
        int pivot = -1;

        // Find the pivot point (where rotation happens)
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivot = i;
                break;
            }
        }

        int lp = (pivot + 1) % n; // smallest
        int rp = pivot;           // largest

        while (lp != rp) {
            int sum = list.get(lp) + list.get(rp);

            // Case 1: If the sum matches the target
            if (sum == target) {
                return true;
            }

            // Case 2: If the sum is less than the target
            if (sum < target) {
                lp = (lp + 1) % n; // move to the next smallest
            } else {
                // Case 3: If the sum is greater than the target
                rp = (n + rp - 1) % n; // move to the next largest
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        
        int target = 16;
        System.out.println(pairSum2(list, target)); // Output should be true
    }
}
