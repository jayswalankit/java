import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter your no");
        int a,count=0;
        a=sc.nextInt();
        while(a!=0){
            a/=10;
            count++;
        }
      System.out.println(count+"=count");
    }
}
