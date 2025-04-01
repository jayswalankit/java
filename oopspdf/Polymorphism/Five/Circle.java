

public class Circle extends Shape{
    public void draw(){
        System.out.println("draw circle");
    }
    public static void main(String[] args) {
        Shape obj=new Circle();
        obj.draw();
        
    }
}
