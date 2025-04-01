
interface  movable {
      void move();
}


interface flyable extends movable{
   void fly();

}

// interface flyable {
//     void fly();
 
//  }
 
public class Bird implements flyable,movable{
    public void move(){
        System.out.println("Humans are walking");
    }
    public void fly(){
        System.out.println("birds are flying");
    }
    public static void main(String[] args) {
        
        Bird obj=new Bird() ;
        obj.move();
        obj.fly();
    }
}

