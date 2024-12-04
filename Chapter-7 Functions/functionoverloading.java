public class functionoverloading {
    public static int sum(int a, int b) {
        return  a+b;
    }
    public static int sum(int a, int b,int c) {
        return  a+b+c;
    }
    public static float sum(float a, float b) {
        return a+b;
    }
    public static void main(String[] args) {
        int a=25;
        int b=75;
        System.out.println(sum(a,b));
        System.out.println(sum(3,5,2));
        System.out.println(sum(3.14f,6.18f));
    }
}
