import java.util.Scanner;

public class Question2 {
    public int subtract(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your first no");
        int a=sc.nextInt();
        System.out.println("enter your second no");
        int b=sc.nextInt();
        int sub=a-b;
        return sub;
    }
    public static void main(String[] args) {
        Question2 q2=new Question2();
        int result=q2.subtract();
        System.out.println("the result is: "+result);
    }
}
