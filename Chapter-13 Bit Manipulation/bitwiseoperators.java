public class bitwiseoperators {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        System.out.println("Binary And:"+ (a&b));
        System.out.println("Binary Or:"+ (a|b));
        System.out.println("Binary XOr:"+ (a^b));
        System.out.println("Binary 1's complement:"+ (~b));
        System.out.println("Binary left shift :"+ (a<<b));
        System.out.println("Binary Right shift :"+ (a>>b));


    }
}
