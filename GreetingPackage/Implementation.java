// GreetingPackage/Implementation.java
package GreetingPackage;
import GreetingPackage.Greeting;
public class Implementation {
    public static void main(String[] args) {
        // Create an instance of Greeting
        Greeting greeter = new Greeting("Ayush");

        // Use the greeting methods
        System.out.println(greeter.sayHello());   // Output: Hello, Ayush!
        System.out.println(greeter.sayGoodbye()); // Output: Goodbye, Ayush!

        // Change the name and display the greeting again
        greeter.setName("John");
        System.out.println(greeter.sayHello());   // Output: Hello, John!
    }
}
