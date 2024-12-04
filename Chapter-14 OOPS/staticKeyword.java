public class staticKeyword {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.schoolName="JMV";
        Student s2 = new Student();
        System.out.println(s2.schoolName);
        Student s3 = new Student();
        s3.schoolName="DSS";
        System.out.println(s3.schoolName);
        System.out.println(s2.schoolName);
        System.out.println(s1.getPercentage(97, 98, 99));
    }
}
class Student{
    String name;
    int roll;
    static String schoolName;
    void setName(String name){
       this.name=name;
    }
    String getName(){
        return this.name;
     }
   static int getPercentage(int phy, int chem, int math){
    return ((math+phy+chem)/3);
   }
}