import java.util.Scanner;

public class Question3 {
    public int multiply(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your first no");
        int a=sc.nextInt();
        System.out.println("enter your second no");
        int b=sc.nextInt();
        int multi=a*b;
        return multi;
    }
    public static void main(String[] args) {
        Question3 q2=new Question3();
        int result=q2.multiply();
        System.out.println("the result is: "+result);
    }
}
