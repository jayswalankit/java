
import java.util.Scanner;
public class Question13 {
    public void pattern(int length,int breadth){
        for(int i=1;i<=length;i++){
            for(int j=breadth;j>=i;j--){
            System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                if(i%2==0){
                    continue;
                }
                System.out.print("* ");
            }
                  System.out.println();
        }
      }
    
    
    
    
    
        public void input(){
           Scanner sc=new Scanner(System.in);
           System.out.println("enter your length");
           int length=sc.nextInt();
           System.out.println("enter your breadth");
           int breadth=sc.nextInt();
           pattern(length, breadth);
           
        }  
    public static void main(String[] args) {
        Question13 q13=new Question13();
        q13.input();
    }
}
