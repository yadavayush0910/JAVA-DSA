public class ContainsDuplicate {
    public static boolean  containsDuplicate(int [] numbers) {
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]==numbers[j])
                  return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7};
        System.out.println(containsDuplicate(numbers));
    }
}
