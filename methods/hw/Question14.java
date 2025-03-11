public class Question14 {

    public void strong(int n){
     int fact,i,rem,sum=0;
     for(int tem=n;tem!=0;tem/=10){
        rem=tem%10;
        fact=1;
       for(i=1;i<=rem;i++){
        fact*=i;
        
       }

       sum+=fact;
     }
     if(sum==n){
        System.out.println("yes");
     }
     else{
        System.out.println("no");
     }
     
    }
    public static void main(String[] args) {
        Question14 q14=new Question14();
        q14.strong(145);
    }
}
