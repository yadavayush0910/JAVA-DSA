public class largestString {

    public static void main(String[] args) {
        String fruits[] = {"Apple", "Mango", "Banana"};
        String largest = fruits[0];
        
        for (int i = 1; i < fruits.length; i++) { // Start from 1 since we already initialized with fruits[0]
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        
        System.out.println("The lexicographically largest string is: " + largest);
    }
}
