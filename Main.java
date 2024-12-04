class Main2 {
    int k = 111;
    static int a = 222;

    public static void greet() {
        System.out.println("Hello, this is a static method");
        // Create an instance to call the non-static method
        Main2 instance = new Main2();
        System.out.println(instance.k); // Accessing non-static variable k
        instance.bye();  // Call the non-static method
    }

    public void bye() {
        System.out.println("Bye, this is a non-static method");
    }
}

public class Main {
    int i = 10;
    static int j = 12;

    public static void main(String[] args) {
        Main m1 = new Main();
        System.out.println(m1.i);   // Output: 10
        System.out.println(Main.j);  // Output: 12

        Main2 m2 = new Main2();
        System.out.println(m2.k);    // Output: 111
        System.out.println(Main2.a);  // Output: 222

        m2.greet(); // Call the static method which calls the non-static method
    }
}
