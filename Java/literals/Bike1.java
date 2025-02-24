import java.util.Scanner;
 class Bike1 {
    Scanner sc=new Scanner(System.in);
    private int number=2;
    private String name=sc.nextLine();
    void bik(){
         int price=3;
     System.out.println("price: "+price + " number is: "+number + " name is: "+name);
     }
     public static void main(String[] args) {
        Bike1 b1=new Bike1();
        b1.bik();
     }
    }
    

