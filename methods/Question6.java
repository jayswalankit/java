
import java .util.Scanner;
public class Question6 {

public int multi2(int a,int b){
    int product=a*b;
    return product;
}


    public void multi(){
        Scanner sc=new  Scanner(System.in);
        System.out.println("enter your 1st no");
        int a=sc.nextInt();
        System.out.println("enter your 2nd no");
        int b=sc.nextInt();
        int result=multi2(a,b);
        System.out.println("the result is: "+result);
    }
    public static void main(String[] args) {
        Question6 q6=new Question6();
        q6.multi();
    }
}
