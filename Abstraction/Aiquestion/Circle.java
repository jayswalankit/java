

public class Circle extends Shape{
    float radius;
 public  Circle(float radius){
     this.radius=radius;
 }
 public void calculatearea(){
    System.out.println(Math.PI*radius*radius + "area");
 }
 public void calculateperimeter(){
    System.out.println(2*3.14*radius);
 }
     public static void main(String[] args) {
        Circle obj=new Circle(12f);
        obj.calculatearea();
        obj.calculateperimeter();
        obj.display();
     }
}
