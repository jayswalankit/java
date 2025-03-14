public class Car extends Vehicle {
    public void honk(){
        System.out.println("peeee");
    }
    public static void main(String[] args) {
        Car obj=new Car();
       obj.honk();
       obj.startengine();
    }
}
