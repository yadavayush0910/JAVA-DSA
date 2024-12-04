import java.util.ArrayList;

public class OperationsOnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        System.out.println(list.get(3));
        list.remove(3);
        System.out.println(list);
        list.set(0,10);
        System.out.println(list);
         System.out.println(list.contains(10));
         list.add(1,20);
         System.out.println(list);
         System.out.println(list.size());
         //Print 
         for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
         }
    }
}
