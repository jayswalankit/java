

public class Printer {
     public void print(int a){
       System.out.println(12);
     }

     public void print(String  a){
        System.out.println("ayush ");
      }

      public void print(double a){
        System.out.println(12.3);
      }
    public static void main(String[] args) {
        Printer obj=new Printer();
        obj.print(1);
        obj.print("ankit");
        obj.print(56.6);
    }
}
