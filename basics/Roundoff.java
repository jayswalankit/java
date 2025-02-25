import java.util.Scanner;
public class Roundoff
{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("entere your no");
    float a=sc.nextFloat();
       int b=(int)(a+0.5);
    System.out.println(b);

}
}