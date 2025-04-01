
import java.util.*;
public class Sum {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int [] arr=new int[input];
                System.out.println("enter your no");
                for(int i=0;i<arr.length;i++){
                    arr[i]=sc.nextInt();
                }
                  int sum=0;
                for(int i=0;i<arr.length;i++){
                       sum+=arr[i];
                }
             System.out.println(sum);
     }
}
