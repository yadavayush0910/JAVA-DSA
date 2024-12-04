public class MethodOverriding {
    public static void main(String[] args) {
            Animal a1= new Animal();
            a1.eat();;
            Deer d1 = new Deer();
            d1.eat();
    }
}
class  Animal{
    void eat(){
        System.out.println("Animal-eats");
    }
}
class  Deer extends Animal{
    void eat(){
        System.out.println("Deer-eats");
    }
}