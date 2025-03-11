
import java.util.Scanner;
public class Question11 {
    


    public void sum(int n){
        // Scanner sc=new Scanner(System.in);
        int  i=0,sum=0;
        int count=0;
       while(count<=n){
        if( i%2!=0){
            sum+=i;
            count++;
        }
        i++;
       }
       System.out.println(sum);

    }
    public void input(){
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter your no");
       int n= sc.nextInt();
       sum(n);
        }
        public static void main(String[] args) {
            Question11 obj=new Question11();
            obj.input();
        }
    }



