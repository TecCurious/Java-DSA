public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}
    
interface ChessaPlayer{
    void moves();
} 

class Queen implements ChessaPlayer{
   public void moves(){
        System.out.println("up, down, right, left diagonal (in 4 sides)");
    }
}

class Rook implements ChessaPlayer{
   public void moves(){
        System.out.println("up, down, right, left diagonal (one step)");
    }
}