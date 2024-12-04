
public class AccessModifier {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount(); 
        myAcc.username="ayushyadav";
        myAcc.setPassword("abcde");
    }
}
class  BankAccount{
    public String username;
    private String password;
     public void setPassword(String pwd)
     {
        password=pwd;
     }
}
