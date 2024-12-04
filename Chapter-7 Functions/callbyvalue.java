public class callbyvalue {
    public static void value(int a) {
        a = 10;
        System.out.println("Inside value function: " + a);
    }

    public static void main(String[] args) {
        int a = 18;
        System.out.println("Before value function: " + a);
        value(a);
        System.out.println("After value function: " + a);
    }
}
