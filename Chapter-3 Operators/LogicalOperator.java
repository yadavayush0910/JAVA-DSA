public class LogicalOperator {
    public static void main(String[] args) {
        int a=5;
        int b=23;
        if((a<10) && (b>5)){
            System.out.println(++a);
            System.out.println(++b);
        }
        else{
            System.out.println(a++);
            System.out.println(b++);
        }

        if(!(a>5)){
        System.out.println("a is less than oe equal to 5");
        }
        else{
            System.out.println("a is greater than 5");

        }
        // if((2==2)||(3==4)){
        //     System.out.println("Dono me ek true");
        // }else{
        //     System.out.println("Dono false");
        // }
    }
}
