public class Abstraction {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // Chicken c = new  Chicken();
        // c.eat();
        // c.walk();
        // Mustang myHorse = new Mustang();
        // Chicken ch = new  Chicken();
        Horse h = new Horse();
    }
}
abstract class Animal{
    String color;
     Animal() {
        color="brown";
        System.out.println("Animal Constructor Called");
    }
    
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();
} 
class Horse extends Animal{

     Horse() {
        System.out.println("Horse Constructor called");
    }
    
    void walk(){
        System.out.println("Walks on 4 legs");
    }
    void ChangeColor(){
        color="dark brown ";
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor Called");
    }
}
class Chicken extends Animal{

   Chicken() {
    System.out.println("Chicken Constructor Called");
    }
    
    void walk(){
        System.out.println("Walks on 2 legs");
    }
    void ChangeColor(){
        color="Yellow";
    }
}