
import java .util.Scanner;
public class Question15 {

public void count( int a){
int tem=0;
tem=a;
int count=0;
while(tem!=0){
    count++;
    tem/=10;
}
System.out.println("the count is "+count);
}
public void power(int a){
   Scanner sc=new Scanner(System.in);
   System.out.println("enter your power");
   int n=sc.nextInt();
   int result=0;
   while()

}




    public void input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your no");
        int a=sc.nextInt();
        count(a);
    }
    public static void main(String[] args) {
        Question15 q15=new Question15();
    q15.input() ;   }
}
