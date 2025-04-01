import java.util.*;
public class Three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] arr={
        {1,2,3,4,5},{6,7,8},{5,6,7,8}
        };
        int a=sc.nextInt();
        int flag=0;
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
             if(arr[i][j]==a){
                flag=1;
             }
            }
        }
        if(flag==0){
            System.out.println("not present");
        }
        else{
            System.out.println("present");
        }
    }
}
