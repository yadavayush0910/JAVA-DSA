// GreetingPackage/Greeting.java
package GreetingPackage;

public class Greeting {
    private String name;

    // Constructor
    public Greeting(String name) {
        this.name = name;
    }

    // Method to return a greeting message
    public String sayHello() {
        return "Hello, " + name + "!";
    }

    // Method to return a goodbye message
    public String sayGoodbye() {
        return "Goodbye, " + name + "!";
    }

    // Method to set a new name
    public void setName(String name) {
        this.name = name;
    }

    // Method to get the current name
    public String getName() {
        return this.name;
    }
}
