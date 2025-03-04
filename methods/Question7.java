import java.util.Scanner;

public class Question7 {


public int check1(int a){
    int even=a%2;
    if(even==0){
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
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        

    }
    public static void main(String[] args) {
        Question7 q7=new Question7();
        q7.check();
    }
}
