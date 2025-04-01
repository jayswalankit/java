 import  java .util.*;

public class One {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int []arr;
      arr=new int[5];
      System.out.println("enter your no");
      for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int min=9999,max=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];

        }
        if(arr[i]>max){
            max=arr[i];
            
        }
    }
    System.out.println(min + "minimum  no");
    System.out.println(max + "maximum no");
    }
}
