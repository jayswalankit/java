import java.util.Scanner;
public class Question5 {

public int add1(int a,int b){
   int sum=a+b;
   return sum;
}


    public void add(){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter your 1st no");
        int a=sc.nextInt();
        System.out.println("enter your 2st no");
        int b=sc.nextInt();
        int result = add1(a, b);
        System.out.println("the result is: "+result);
    }
    public static void main(String[] args) {
        Question5 q5=new Question5();
         q5.add();
        
    }
}
