

public class Triangle  extends Shape{
     public void draw(){
        System.out.println("draw triangle");
     }
     public static void main(String[] args) {
        Shape obj=new Triangle();
        obj.draw();
       
    }
}
