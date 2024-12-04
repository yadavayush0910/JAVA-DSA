public class ConvertToUpperString {
    public static String toUpperLetter(String name) {
        StringBuilder sb = new StringBuilder();
        boolean capitalizeNext = true;

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (ch == ' ') {
                sb.append(ch);
                capitalizeNext = true; // Next character should be capitalized
            } else if (capitalizeNext) {
                sb.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "ayush yadav is a developer";
        System.out.println(toUpperLetter(str));
    }
}
