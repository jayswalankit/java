import java.util.Scanner;
public class Question4 {
    public int divide(int a,int b){
        
        int reminder=a%b;
        // int quotient=a/b;
       return reminder;
     
    }
    public int quotient(int a,int b){
      int result1=a/b;
      return result1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your first no");
        int a=sc.nextInt();
        int b=sc.nextInt();
        Question4 q4=new Question4();
        int result=q4.divide(a,b);
        int ans=q4.quotient(a, b);
        System.out.println("the result is "+result);
        System.out.println("the result is "+ans);
    }
}
