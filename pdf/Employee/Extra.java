import java.util.*;

public class Extra {

    private int []arr; 
     Extra (int [] arr){
        this.arr=arr;
     }

     public void setArr(int []arr){
       this.  arr = arr;
     }

     public int[] getArr(){
        return arr;
     }
    public static void main(String[] args) {
        Extra obj=new Extra(new int[]{3});
        Scanner sc=new Scanner(System.in);
        //   obj.setArr(new int[]{2,3,4,5,6,7,5,6,7,8,9,0});
        //   int length = obj.getArr().length;
        //   System.out.println("Array length: " + length);
        //   System.out.println(Arrays.toString(obj.getArr()));
    //   obj.setArr(new int[]{2,3,4,5,6,7,5,6,7,8,9,0});
    int []arr=new int[3];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();

    }
    obj.setArr(arr);
for(int i=0;i<arr.length;i++){
    System.out.println((Arrays.toString(obj.getArr())));
}
    sc.close();
      
        
    }
       
    }

    

