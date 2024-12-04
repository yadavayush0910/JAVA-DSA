public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dogs d1 = new Dogs();
        d1.breed="German-Shepherd";
        System.out.println(d1.breed);
        d1.eat();
        d1.legs=4;
        System.out.println(d1.legs);
        d1.breathe();
        Birds b1= new Birds();
        b1.fly(); 
    }
}
class Animal{
    String color;
    void eat(){
         System.out.println("Animal-Eat");
    }
    void breathe(){
        System.out.println("Animal Breathe");
    }
}
class Mammal extends Animal{
    int legs;
}
class Dogs extends Mammal{
      String breed;
}
//Hieraerchial inheritance with Animal class
class Birds extends Animal{
    void fly(){
        System.out.println("Birds-fly");
    }
}