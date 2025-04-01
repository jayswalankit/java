import java.util.*;
public class Four {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr;
        arr=new int[5];
        System.out.println("enter your no");
        for(int i=0; i<arr.length;i++){
           arr[i]=sc.nextInt();
        }
    
      
        for(int i=0;i<arr.length;i++){
         int flag=0;
         for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
               flag=1;
               break;
            }

         }
         if(flag==0){
            System.out.println(arr[i]);
         }
         
      }
        
        
   
}
}
