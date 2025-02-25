import java.util.Scanner;
public class Ascending {
    void ascending(){
         Scanner sc=new Scanner(System.in);
         System.out.println("enter your 1st no");
         int a=sc.nextInt();
         System.out.println("enter your 2nd no");
         int b=sc.nextInt();
         System.out.println("enter your 3rd no");
         int c=sc.nextInt();
         if(a<b){
            if(a<c){
                if(b<c){
                    System.out.println("a<b<c");
                }
                else{
                    System.out.println("a<c<b");
                }
            }
            else{
                System.out.println("c<a<b");
            }
         }
         else{
            if(b<c){
                if(a<c){
                    System.out.println("b<a<c");
                }
                else{
                    System.out.println("b<c<a");
                }
            }
            else{
                System.out.println("c<b<a");
            }
         }
    }
    public static void main(String[]args){
        Ascending hello=new Ascending();
        hello.ascending();
    }
}















