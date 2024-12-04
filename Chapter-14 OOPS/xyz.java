// class Parent{
//     Parent(){
//         // System.out.println("Parent Class Constructor");
//     }
// }
// class Child extends Parent{
//     Child(){
//         System.out.println("Child Class Constructor");
//     }
// }
// class SuperTest{
//     public static void main(String [] args){
//         Child child= new Child();
//     }
// }
class Abc{
    Abc(){
        System.out.println("Hello");
    }
  }
  class xyz extends Abc{
      xyz(){
        //   super();
      }
      public static void main(String [] args){
         xyz x1= new xyz();
      }
  }