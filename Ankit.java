import java.util.Scanner;
class Ankit {
    int no;
    String name;
   protected void show(){
           Scanner sc=new Scanner (System.in);
       System.out.println("enter your no");
           no=sc.nextInt();
           sc.nextLine();
           System.out.println("enter your name");
           name=sc.nextLine();

System.out.println("No: " + no);
        System.out.println("Name: " + name);

   }

}

class Ankesh extends Ankit{
   public static void main(String[] args) {
       Ankesh obj=new Ankesh();
       obj.show();

   }
}







