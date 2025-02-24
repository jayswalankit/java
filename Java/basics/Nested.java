import java.util.Scanner;
public class Nested{
    void nested(){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter your first no");
        int a=sc.nextInt();
        System.out.println("enter your first no");
        int b=sc.nextInt();
        System.out.println("enter your first no");
        int c=sc.nextInt();
        if(a<b){
            if(a<c){
                System.out.println("a is  smallest");
            }
            else{
                System.out.println("c is smallest");
            }
        }
       else{
        if(b<c){
          System.out.println("b is smallest");
        }
        else{
            System.out.println("c is smallest");
        }
       }
    }
    public static void main(String[] args) {
        Nested obj=new Nested();
        obj.nested();
    }
}