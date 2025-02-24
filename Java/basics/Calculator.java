import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose your no (1=sum,2=sub,3=multi,4=divide)");
        int c=sc.nextInt();
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        switch (c) {
            case 1:
                int sum=a+b;
                System.out.println("the sum is "+sum);
                break;
                case 2:
                int sub=a-b;
                System.out.println(sub);
                break;
                case 3:
                int multi=a*b;
                System.out.println(multi);
                break;
                case 4:
                int divide=a/b;
                System.out.println(divide);
                break;
            default:
                break;
        }
    }
}
