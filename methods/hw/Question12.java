
import java.util.Scanner;

public class Question12 {
    public int product(int n){
     int fact=1,i=1,count=0;
     for( int tem=n;tem!=0;tem/=10){
       int rem=tem%10;
       fact*=rem;

     }
     return fact;
    }
    public void input(){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter your no");
  int n=sc.nextInt();
  int result= product(n);
  System.out.println(result);
    }
    public static void main(String[] args) {
        Question12 q12=new Question12();
        q12.input();
    }
}
