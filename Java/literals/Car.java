import java.util.Scanner;
 class Car {
    Scanner sc= new Scanner(System.in);
        String name=sc.nextLine();
        String brand=sc.nextLine();
    void carprice(){
        
        int price=sc.nextInt();
        
        System.out.println("price:"+price + " car name: "+name + " car brand :"+brand);
        
    }
    public static void main(String[] args) {
        Car c1=new Car();
        c1.carprice();
    }
}

