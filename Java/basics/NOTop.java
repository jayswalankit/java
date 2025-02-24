

import java.util.Scanner;
public class NOTop
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter your no");
int a=sc.nextInt();

if(a>0&&a!=0)
{
System.out.println("POSITIVE "+a);
}
else if(a<0&&a!=0)
{
System.out.println("NEGATIVE "+a);
}
else
{
    System.out.println("ZERO "+a);
}
}
}
