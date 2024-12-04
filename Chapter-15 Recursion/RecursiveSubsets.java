public class RecursiveSubsets {
    public static void subset(String str, String curr, int i) {
       if(i==str.length())
       {
        System.out.println(curr);
        return;
       }
       subset(str, curr, i+1);
       subset(str, curr+str.charAt(i), i+1);
    }

    public static void main(String[] args) {
        String s = "abc"; // Example input
        subset(s, "", 0);
    }
}
