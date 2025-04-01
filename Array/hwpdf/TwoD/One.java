
import java.util.*;
public class One {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows");
        int row=sc.nextInt();
        System.out.println("enter your columns");
        int column=sc.nextInt();
        int [][] arr=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            int sum=0;
            for(int j=0;j<column;j++){
            
            sum+=arr[i][j];
            }
            System.out.println("result of row");
            System.out.print(sum);
        }
        for(int j=0;j<column;j++){
            int sum2=0;
            for(int i=0;i<row;i++){
               sum2+=arr[i][j];
            }
            System.out.println("result of column");
            System.out.println(sum2);
        }
        }
}
