
import java.util.ArrayList;


public class TwoDimensionalArrayList {
 public static void main(String[] args) {
     ArrayList<ArrayList<Integer>>lists=new ArrayList<>();
     ArrayList<Integer>list1= new ArrayList<>();
     ArrayList<Integer>list2=new ArrayList<>();
     ArrayList<Integer>list3=new ArrayList<>();
     for(int i=1;i<=5;i++){
        list1.add(i*1);// 1 2 3 4 5
        list2.add(i*2);// 2 4 6 8 10
        list3.add(i*3); // 3 6 9 12 15
     }
     lists.add(list1);
     lists.add(list2);
     lists.add(list3);

     for(int i=0;i<lists.size();i++){
        ArrayList<Integer> lis= lists.get(i);
        for(int j=0;j<lis.size();j++){
            System.out.print(lis.get(j)+" ");
        }
        System.out.println();
     }
 }   

}
