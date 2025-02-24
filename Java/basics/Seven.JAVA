import java.util.Scanner;

public class Seven {
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter your no");
      int a=sc.nextInt();
      System.out.println("enter your no");
      int b=sc.nextInt();
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println("after swap");
      System.out.println(a);
      System.out.println(b);
   }
}


