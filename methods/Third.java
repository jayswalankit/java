

public class Third {
    public int add(int a,int b){
        int sum=a+b; 
      return sum;
    }
    public static void main(String[] args) {
        Third s1=new Third();
        int result=s1.add(5,4);
        System.out.println(result);
    }
}
