
import java.util.Scanner;
public class Question12 {

  public void pattern(int length,int breadth){
    for(int i=1;i<=length;i++){
        for(int j=1;j<=breadth;j++){
        System.out.print("*");
        }
              System.out.println();
    }
  }





    public void input(){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter your length");
       int length=sc.nextInt();
       System.out.println("enter your breadth");
       int breadth=sc.nextInt();
       pattern(length, breadth);
       
    }  
public static void main(String[] args) {
    Question12 q12=new Question12();
    q12.input();
}
}









