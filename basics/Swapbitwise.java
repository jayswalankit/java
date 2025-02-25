import java.util.Scanner;

public class Swapbitwise {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your no ");
        int a=sc.nextInt();
        System.out.println("before change" +a);
        int b=sc.nextInt();
        System.out.println("before change" +b);
        a=(a^b);
        b=(a^b);
        a=(a^b);
        System.out.println("after change" +a);
        System.out.println("after change" +b);

    }
}
