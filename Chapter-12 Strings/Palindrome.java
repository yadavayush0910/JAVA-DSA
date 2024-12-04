public class Palindrome {
    public static void checkPalindrome() {
        String str = "MalayalaM";
        boolean isPalindrome = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                System.out.println("Not a palindrome");
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("It is a palindrome");
        }
    }
    public static boolean isPalindrome() {
        String str1="racecar";
        int start=0;
        int end=str1.length()-1;
        while(start<=end){
            if(str1.charAt(start)!=str1.charAt(end))
            {
                 return false;
                
            }
            start++;
            end--;
        }
        return true;
        
    }

    public static void main(String[] args) {
        checkPalindrome();
       boolean PalindromeStatus=isPalindrome();
       System.out.println(PalindromeStatus);
    }
}
