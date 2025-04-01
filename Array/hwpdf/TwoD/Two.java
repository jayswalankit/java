import java.util.*;
public class Two {
     public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter your row");
        int row=sc.nextInt();
        System.out.println("enter your column");
        int column =sc.nextInt();
        int [][] arr=new int [row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("before transpose");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
               System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("after transpose");
        for (int i=0;i<column;i++){
          for(int j=0;j<row;j++){
            System.out.print(arr[j][i]+ " ");
          }
          System.out.println();
        }
     }
}
