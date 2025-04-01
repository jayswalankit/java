

public class Bike extends Vehicle1 {
    Bike(String brand) {
        super(brand);
    }
    public void name(String name){
        
        System.out.println("hello");
    }
    public static void main(String[] args) {
        Bike obj=new Bike("BMW");
        obj.name("Azad");
      obj.bikename();
    }
}
