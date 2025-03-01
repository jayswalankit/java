
import java.util.Scanner;
   



public class Extra {
    int a=1;
    static int b=5;
   public void call(){
        // while(a<5){
            System.out.println(a);
            a++;
        // } 
    } 
   static  void  call2(){
    // System.out.println(b);
    b++;
   }
   public static void main(String[] args) {
    Extra e1=new Extra();
    e1.call();
    e1.call();
    call2();
 

    Extra e2=new Extra();
    e2.call();
    call2();
   
    
   }


   
    }

