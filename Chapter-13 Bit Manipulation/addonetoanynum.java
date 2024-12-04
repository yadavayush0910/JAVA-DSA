public class addonetoanynum {
    public static int add1(int num) {
        return (-(~num));
    }
    public static void main(String[] args) {
        System.out.println(add1(7));
    }
}
