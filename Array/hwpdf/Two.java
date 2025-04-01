 import java.util.*;
public class Two {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your size ");
    int size=sc.nextInt();
    int [] arr=new int[size];
   
    System.out.println("enter your first array elements");
    for (int i = 0; i < size; i++) {
        arr[i] = sc.nextInt();
    }

   
    System.out.println("enter your second array size");
         int size2=sc.nextInt();
         int [] arr2 =new int[size2];
         System.out.println("enter your second array");
         for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

         int [] mergedarr=new int[size+size2];
         
         System.out.println("result");
        for(int i=0;i<size;i++){
            mergedarr[i]=arr[i];
        }

        for(int i=0;i<size2;i++){
            mergedarr[size+i]=arr2[i];
        }
        
       
      for(int i=0;i<mergedarr.length;i++){
        for(int j=i+1;j<mergedarr.length;j++){
            if(mergedarr[i]<mergedarr[j]){
                int tem=mergedarr[i];
                mergedarr[i]=mergedarr[j];
                mergedarr[j]=tem;
            }
        }
        System.out.println(mergedarr[i]);
      }
    }
}
