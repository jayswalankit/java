public class Question6 {
    public void triangle(int n){
        for(int i=0;i<=n;i++){
           int a=1;
           for(int j=0;j<=i;j++){
            System.out.print(a++ );
           
           }
           System.out.println(" ");
        }
   }
   public static void main(String[] args) {
       Question6 obj=new Question6();
       obj.triangle(4);
   }
}
