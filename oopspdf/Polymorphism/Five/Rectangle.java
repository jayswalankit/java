

public class Rectangle extends Shape {
     public void draw(){
        System.out.println("draw rectangle");
     }
     public static void main(String[] args) {
        Shape obj=new Rectangle();
        // Shape obj=new Circle();   // Agar new ke baad Circle kar de to wo print kar dega... means Parent name ho to usme different child class ko print karwa sakte hai ....
        obj.draw();
        
    }
}
