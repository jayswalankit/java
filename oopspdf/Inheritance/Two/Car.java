package oopspdf.Inheritance.Two;


public class Car extends Vehicle {
     String fueltype;

     Car(String brand,String speed,String fueltype){
       super(brand,speed);
       this.fueltype=fueltype;
     }
     public static void main(String[] args) {
        Car obj=new Car("koenigsegg", "200km/h", "full");
        System.out.println(obj.brand);
        System.out.println(obj.speed);
        System.out.println(obj.fueltype);
        
     }
}
