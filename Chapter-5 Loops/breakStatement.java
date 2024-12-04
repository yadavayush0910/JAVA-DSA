public class breakStatement {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
        System.out.println("i:"+i);
        if(i==3){
            System.err.println("Stop");
            break;
        }
        }
    }
}
