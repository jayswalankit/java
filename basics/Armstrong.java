import java.util.Scanner;
public class Armstrong{
    void  armstrong(){
        Scanner sc=new Scanner(System.in);
        int count=0,sum=0,fact,tem=0,i;
        System.out.println("enter your no");
        int n=sc.nextInt();
        for(tem=n;tem!=0;tem/=10){
            count++;
        }
        for(tem=n;tem!=0;tem/=10){
            int rem=tem%10;
            fact=1;
            for( i=1;i<=count;i++){
                fact*=rem;
            }
            sum+=fact;
        }
        if(sum==n){
            System.out.println(n+"yes armstrong");
        }
        else{
            System.out.println(n+"no armstrong");
        }
    }
    public static void main(String[] args) {
        Armstrong obj = new Armstrong();
        obj.armstrong();
}
}