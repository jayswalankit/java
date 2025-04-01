

 abstract class One {
     String name;
     One (String name){
     this.name=name;
     }

     abstract void name();
     public void name1(){
        System.out.println("Enter your name " + name);
     }
    }
   
    
    public class Car extends One {
        Car(String user) {
            super(user);
        }
    
        @Override
       public void name() {
            System.out.println("Car name is: " + name);
        }
    
    
    public static void main(String[] args) {
        Car car = new Car("Toyota");
        car.name1();
        car.name();
    }
    }
