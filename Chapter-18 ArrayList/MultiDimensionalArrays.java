import java.util.*;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        // First part: mainList
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        mainList.add(list);
        
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        mainList.add(list2);
        
        System.out.println(mainList);
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

        // Second part: secondaryList
        ArrayList<ArrayList<Integer>> secondaryList = new ArrayList<>();
        
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        secondaryList.add(list1);
        
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(3);
        secondaryList.add(list3);
        
        for (int i = 0; i < secondaryList.size(); i++) {
            ArrayList<Integer> currentList = secondaryList.get(i);
            for (int j = 0; j < currentList.size(); j++) {
                System.out.print(currentList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
