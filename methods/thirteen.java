// import java .util.Scanner;

// public class Question11 {

// public void reverse(int sp,int ep){
//     int a=0, b=1,sum=0;
//     while(a<=ep){
//         if(a>=sp){
//             System.out.println("result="+a);
//         }
//         sum=a+b;
//         a=b;
//         b=sum;
//     }
// }
//     public void input(){
//         Scanner sc=new Scanner(System.in);
//       System.out.println("enter your first no");
//       int sp=sc.nextInt();
//       System.out.println("enter your second no");
//       int ep=sc.nextInt();
//       reverse(sp, ep);
//     }
//     public static void main(String[] args) {
//         Question11 q11=new Question11();
//         q11.input();
//     }
// }
















import java.util.Scanner;

public class thirteen {
    void  checker(int a , int b){
        int sum=0;
        int i=0;
        int j=1;
        while (i<=b) {
            if(i>=a){
                System.out.println(i);
            }

            sum = i+j;
        i=j;
            j=sum;

        }
    }
    void input(){
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the value of a"); 
        int a = Sc.nextInt();
        System.out.println("enter the value of b"); 
        int b = Sc.nextInt();
        checker(a, b);


    }
    public static void main(String[] args) {
        thirteen obj = new thirteen();
        obj.input();
    }
}
