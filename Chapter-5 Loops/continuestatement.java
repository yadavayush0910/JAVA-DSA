public class continuestatement {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i==3){
                System.out.println("Skipped i");
                continue;
            }
            System.out.println("i:"+i);
        }
    }
}
