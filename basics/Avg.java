 
 import java.util.Scanner;
 public class Avg {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your no");
    float a=sc.nextFloat();
    System.out.println("enter your no");
    float b=sc.nextFloat();
    System.out.println("enter your no");
    float c=sc.nextFloat();
    float sum=a+b+c;
    float avg=sum/3;
    System.out.println(avg);
 }
}