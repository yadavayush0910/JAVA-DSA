public class copyconstructor {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name="Ayush";
        s1.roll=127;
        s1.password="Ayush";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        Student s2= new Student(s1);
        s2.password="ayushyadav";
        s1.marks[2]=100;
        for(int i=0;i<3;i++){
            System.out.print(s2.marks[i]);
        }

    }
}
class Student {
    String name;
    int roll;
    String password;
    int[] marks;

    // Deep Copy Constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
    // // Shallow Copy
    // Student(Student s1){
    //     marks= new int[3];
    //     this.name=s1.name;
    //     this.roll=s1.roll;
    //     this.marks=s1.marks;
    // }
    
     // Default Constructor
    Student() {
        marks = new int[3];
    }
}

    

