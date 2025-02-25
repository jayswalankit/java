import java .util.Scanner;
public class Strong {
    void Song(){
        Scanner sc=new Scanner(System.in);
        int i, tem=0,fact,rem,sum=0;
        System.out.println("enter your no");
        int n=sc.nextInt();
        for(tem=n;tem!=0;tem/=10){
         fact=1;
         rem=tem%10;
         for(i=1;i<=rem;i++){
            fact*=i;
           
         }
         sum+=fact;
        }
    
    if(sum==n){
        System.out.println(n+"yes");
    }
    else{
        System.out.println(n+"no");
    }
    
}
public static void main(String[]args){
   Strong obj=new Strong();
   obj.Song();
}
}
