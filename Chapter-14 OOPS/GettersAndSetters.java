
public class GettersAndSetters {
    public static void main(String[] args) {
        Pen p1= new Pen();
        p1.setColor("Blue");
        p1.setTip(5);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
        Pen p2= new Pen();
        p2.setColor("Red");
        p2.setTip(9);
        System.out.println(p2.getColor());
        System.out.println(p2.getTip());
    }
}
class  Pen{
    private String color;
    private int tip;

    String getColor(){
        return color;
    }
    int getTip(){
        return tip;
    }
    void setColor(String color){
        this.color=color;
    }
    void setTip(int tip){
        this.tip=tip;
    }
}