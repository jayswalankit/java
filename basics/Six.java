import java.util.Scanner;
public class Six{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("enter your no");
        int a=sc.nextInt();
        int b=2;
        if(a%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

    }
}