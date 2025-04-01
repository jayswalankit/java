abstract class  Vehicle{
     String brand;
     String year;
     Vehicle (String brand,String year){
        this.brand=brand;
        this.year=year;
     }
     abstract void Start();
      
}
class Car extends Vehicle{
    Car(String brand,String year){
        super(brand, year);
    }
    @Override
    public void Start(){
        System.out.println("Car is Starting");
    }
}

class Bike extends Vehicle{
    Bike(String brand,String year){
        super(brand, year);
    }
    @Override
    public void Start(){
        System.out.println("Bike is Starting");
    }
    public static void main(String[] args) {
       Bike obj=new Bike("Duggati", "Panigale V4");
       obj.Start();
       Car obj1=new Car("Audi", "Q8");
       obj1.Start();
    }
}