

public class Rectangle extends Shape {
    int length,breadth;
     Rectangle (int length,int breadth){
        this.length=length;
        this.breadth=breadth;
     }
     public void calculatearea(){
        System.out.println(length*breadth);
     }
     public void calculateperimeter(){
        System.out.println(2*(length+breadth));
     }
     public static void main(String[] args) {
        Rectangle obj=new Rectangle(3, 02);
        obj.calculatearea();
        obj.calculateperimeter();
        obj.display();
     }
}
