import java.util.Scanner;

public class Question10 {



    public void reverse(int n){
        int rev=0,rem=0;
        for(int tem=n;tem!=0;tem/=10){
            rem=tem%10;
            rev=rem+rev*10;
            
        }
        System.out.println("the result is="+rev);
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your no");
        int n=sc.nextInt();
         reverse(n);

    }public static void main(String[] args) {
        Question10 q10=new Question10();
        q10.input();
    }
}
