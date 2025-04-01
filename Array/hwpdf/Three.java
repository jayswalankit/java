import java.util.*;
public class Three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr;
        arr=new int[5];
        System.out.println("enter your no");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        // for(int i=arr.length-1;i>=0;i--){
        //    System.out.println(arr[i]);
        // }

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int tem =arr[i];
                arr[i]=arr[j];
                arr[j]=tem;
            }
            System.out.println(arr[i]);
        }
      
    }
   
    
}
