public class PALINDROME{
    public static boolean isPalindrome(int n){
        int temp=n;
        int rev=0;
        while(temp!=0){
            int ld=temp%10;
             rev=rev*10+ld;
            temp/=10;
        }
        return (n==rev);
    }
    public static void main(String[] args){
        int n=123;
        System.out.println(isPalindrome(n));

    }
}