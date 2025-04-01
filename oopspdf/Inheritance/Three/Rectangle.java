package oopspdf.Inheritance.Three;


public class Rectangle extends Shape{
    int length,breadth;
     public  int area(int length,int breadth){
         return length*breadth;
     }    
     public static void main(String[] args) {
        Rectangle obj=new Rectangle();
        System.out.println(obj.area(2,2));
    }
}
