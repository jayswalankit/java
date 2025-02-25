import java.util.Scanner;
public class Palindrome {
    void palindrome(){
    Scanner sc=new Scanner (System.in);
   int n,rev=0,tem=0; 
   System.out.println("enter your no");
   n=sc.nextInt();
   tem=n;
   while(tem!=0){
    int rem=tem%10;
    rev=rem+(rev*10);
    tem/=10;
   }
   if(n==rev){
    System.out.println("yes");
   }
   else{
    System.out.println("no");
   }
    }
    public static void main(String[] args) {
        Palindrome obj=new Palindrome();
        obj.palindrome();
    }
}
