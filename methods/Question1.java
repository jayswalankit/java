import java.util.Scanner;

public class Question1 {
   public int add(){
   Scanner sc=new Scanner(System.in);
   System.out.println("enter your first no");
   int a=sc.nextInt();
   System.out.println("enter your second no");
   int b=sc.nextInt();
   int sum=a+b;
   return sum;
   }
   public static void main(String[] args) {
    Question1 q1=new Question1();
    int result=q1.add();
    System.out.println("result 0f sum of a and b: "+result);
   }
}
