import java.util.Scanner;

public class Multiply {

    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
        System.out.println("enter your no you want to multiply");
        int a=sc.nextInt();
        System.out.println("enter the second no you want to multiply");
        int b=sc.nextInt();
        int multiply=a*b;
        System.out.println("the result is "+multiply);
        // a++; 
        a--;
        System.out.println(a);
    }

}











