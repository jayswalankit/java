public class Car {
     private int  speed;

     public Car(int speed){
        this.speed=speed;
     }

     public void accelerate(){
        speed+=10;
        System.out.println(speed);
     }

     public void brake (){
        speed-=10;
        System.out.println(speed);
     }

      public int getSpeed(){
        return speed;
      }
     public static void main(String[] args) {
        Car obj=new Car(50);
     System.out.println(obj.getSpeed());
     obj.accelerate();
     obj.brake();
     }
}
