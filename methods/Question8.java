import java.util.Scanner;

public class Question8 {
    public int check1(int a){
    int i=1,count=0;
    while(i<=a){
        if(a%i==0){
            count++;
        }
        i++;
    }
        if(count==2){
            return 0;
        }
        else{
            return 1;
        }

    
    
}

    public void check(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your no");
        int a=sc.nextInt();
        int result=check1(a);
        if(result==0){
            System.out.println("prime no");
        }
        else{
            System.out.println("not prime no");
        }
        

    }
    public static void main(String[] args) {
        Question8 q8=new Question8();
        q8.check();
    }
}
