public class InterfacesInJava {
    public static void main(String[] args) {
        King k = new King();
        k.moves();
    }
}
interface chessPlayer {
    void moves();
}

class Queen implements chessPlayer{
   public void moves(){
        System.out.println("UP, DOWN,LEFT,RIGHT,DIAGONAL(ALL 4 DIRECTIONS)");
    }
}

class Rook implements chessPlayer{
    public void moves(){
         System.out.println("UP, DOWN,LEFT,RIGHT");
     }
 }

 class King implements chessPlayer{
    public void moves(){
         System.out.println("UP, DOWN,LEFT,RIGHT,DIAGONAL(ALL 4 DIRECTIONS) BY 1");
     }
 }