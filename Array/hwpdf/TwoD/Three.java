import java.util.*;
public class Three {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your row no");
        int row=sc.nextInt();
        System.out.println("enter your column no");
        int column=sc.nextInt();
        System.out.println("enter your row no");
        int row2=sc.nextInt();
        System.out.println("enter your column no");
        int column2=sc.nextInt();
        int [][]arr1=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        int [][]arr2=new int[row2][column2];
        for(int i=0;i<row2;i++){
            for(int j=0;j<column2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        int [][]arr3=new int[row][column2];
        for(int i=0;i<row;i++){
            for(int j=0;j<column2;j++){
               arr3[i][j]=0;
               for(int k=0;k<column;k++){
                arr3[i][j]+=arr1[i][k]*arr2[k][j];
               }
            }
        }

      
        for(int i=0;i<row;i++){
            for(int j=0;j<column2;j++){
               System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
     }
}






