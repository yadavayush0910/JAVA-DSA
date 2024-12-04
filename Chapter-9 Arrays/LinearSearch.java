public class LinearSearch {
    public static int LinearSearch(int arr[],int x) {
        for(int i=0;i<arr.length;i++)
        {
               if(arr[i]==x)
                 return i;
        }
        return -1;
    }
    public static int LinearSearchFruit(String fruits[], String fruit) {
        for(int i=0;i<fruits.length;i++)
        {
               if(fruits[i]==fruit)
                 return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={16,2,93,34,15,76,17,38,19,10};
        String fruits[]={"Apple","Banana","Litchi"};
        System.out.println(LinearSearch(arr,17));
        System.out.println(LinearSearchFruit(fruits,"Litchi"));
    }
}
