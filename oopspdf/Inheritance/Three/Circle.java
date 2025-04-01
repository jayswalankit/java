package oopspdf.Inheritance.Three;
import java.util.*;

public class Circle extends Shape {
    int radius;
    public int area(int radius){
        return 3*radius*radius;
    }
    public static void main(String[] args) {
        Circle obj=new Circle();
        System.out.println(obj.area(2));
    }
}
