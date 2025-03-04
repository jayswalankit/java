import java.util.Scanner;

public class One {
    // static final void show(){
    //     System.out.println("hello");
    // }
    // public static void main(String[] args) {
    //     // One.show();
    //     show();
    // }


//  static synchronized void show(){
    final synchronized void show(){
    System.out.println("hello");
 }
 public static void main(String[] args) {
    One o1=new One();
    o1.show();
 }
}
