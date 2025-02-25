import java.util .Scanner;
public class Car1 {
    Scanner sc=new Scanner(System.in);
    String name=sc.nextLine();
    String brand=sc.nextLine();
   
    public void car1price(){
        int price=sc.nextInt();
        System.out.println("price:"+price + " name is "+name  + " brand is:"+brand);
    }
       public static void main(String[] args) {
        Car1 c1=new Car1();
        c1.car1price();

       }
   

}
