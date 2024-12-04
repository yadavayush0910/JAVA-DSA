 public class PassFail{
    public static void main(){
        Scanner sc=  new Scanner(System.in);
        int marks= sc.nextInt();
        boolean isPass=(marks>=33)? true: false;
        SSystem.out.println(isPass);
    }
 }