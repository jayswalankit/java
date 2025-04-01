import java.util.*;
public class Four {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your row size");
        int row=sc.nextInt();
        System.out.println("enter your column");
        int column =sc.nextInt();
        int [][]arr=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum =0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(i==j){
                   sum+=arr[i][j];
                }
            }
        }
       System.out.println(sum);
       int sum1 =0;
       for(int i=0;i<row;i++){
           for(int j=0;j<column;j++){
               if(i+j==row-1){
                  sum1+=arr[i][j];
               }
           }
       }
      System.out.println(sum1);
   }
    }

