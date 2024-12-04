public class FindPermutation {
    public static void findPermutation(String str, String ans) {
        // Base case: when the input string becomes empty, we print the accumulated result
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // Recursive case: iterate through the string
        for (int i = 0; i < str.length(); i++) {
            // Take the current character
            char curr = str.charAt(i);
            // Form a new string by excluding the current character
            String Newstr = str.substring(0, i) + str.substring(i + 1);
            // Recursive call with the new string and the accumulated answer (ans + curr)
            findPermutation(Newstr, ans + curr);
        }
    }

    public static void main(String[] args) {
        // Test with the string "abc"
        String str = "abc";
        findPermutation(str, "");
    }
}
