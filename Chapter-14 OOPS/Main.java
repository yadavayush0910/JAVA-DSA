class Test {
     int a = 5;
     int b = 10;
}

public class Main {
    public static void main(String[] args) {
        Test t= new Test();
        int sum = t.a + t.b;
        System.out.println("Sum: " + sum);
    }
}
