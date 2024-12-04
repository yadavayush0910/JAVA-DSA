public class Inheritance {
 public static void main(String[] args) {
     Fish f1 = new Fish();
     f1.eat();
     f1.swim();
     f1.breathe();
 }   
}
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathe");
    }
}
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in Water");
    }
}
