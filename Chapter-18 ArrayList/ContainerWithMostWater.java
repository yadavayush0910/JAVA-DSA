
import java.util.ArrayList;


public class ContainerWithMostWater {
    public static int storeWater(ArrayList<Integer>height) {
        int maxWater=Integer.MIN_VALUE;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int heit=Math.min(height.get(i),height.get(j));
                int width=j-i;
                int water=heit*width;
                maxWater=Math.max(maxWater,water);
            }
        }
        return maxWater;
    }
    //Two Pointer Approach
    public static int StoringMaxWater(ArrayList<Integer>height) {
        int lp=0;
        int maximumWater=0;
        int rp=height.size()-1;
        while (lp<rp) {
            int ht=Math.min(height.get(lp),height.get(rp));
            int width=rp-lp;
            int currWater=ht*width;
            maximumWater=Math.max(maximumWater,currWater);
            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
      return maximumWater;
    }

    public static void main(String[] args) {
         ArrayList<Integer>height=new ArrayList<>();
         height.add(1);
         height.add(8);
         height.add(6);
         height.add(2);
         height.add(5);
         height.add(4);
         height.add(8);
         height.add(3);
         height.add(7);
         System.out.println(storeWater(height));
         System.out.println(StoringMaxWater(height));
    }
}
