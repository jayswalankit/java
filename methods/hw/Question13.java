import java.util.Scanner;
public class Question13 {

    public void squareroot(int n){
        int i=0,fact=1;
        while(i<=n){
            fact=i*i;
            if(fact==n){
                System.out.println(i);
                break;
            }
            i++;
        }

    }
    public void input(){
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter your no");
       int n= sc.nextInt();
       squareroot(n);
      
        }
        public static void main(String[] args) {
            Question13 obj=new Question13();
            obj.input();
        }
}
