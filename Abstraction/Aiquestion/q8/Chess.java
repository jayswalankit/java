

abstract class Game {
   abstract void play();
   final void end(){
    System.out.println("Game is over");
   } 
}

public class Chess extends Game {
   public void play (){
    System.out.println("Playing   chess");
   }
   //   public void end(){
   //      System.out.println("game is not over yet");
   //   }   giving error at compile time.....

     public static void main(String[] args) {
        Chess obj=new Chess();
        obj.play();
        obj.end();
     }
}
