public class TernaryOperator {
    public static void main(String[] args) {
        // BoilerPlate
        // boolean a = 5 > 3 ? true : false;
        // System.out.println(a);

        String type = (5 % 2 == 0) ? "Even" : "Odd";
        System.out.println(type);

        int larger = (5 > 3) ? 5 : 3;
        System.out.println(larger);

      
            int a = 63, b = 36;
            boolean x = (a < b ) ? true : false;
            int y= (a > b ) ? a : b;
            System.out.println(x);//false
            System.out.println(y);//63
            
    }
}
