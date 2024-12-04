
import java.util.ArrayList;


public class MaximumInArraylist {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>largest){
                largest=list.get(i);
            }
        }
        System.out.println("Largest in list is: "+ largest);
    }
}
