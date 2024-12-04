public class uppercasetolowercase {
    public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            // Convert uppercase to lowercase using bitwise OR with 32
            System.out.print((char) (ch | 32)+" ");
        }
    }    
}
