

abstract class Animal {
    abstract void makesoud0();
    public void eat(){
        System.out.println("ayush is eating ");
    }
}

class Dog extends Animal{
     void makesoud0(){
        System.out.println("ayush chamar");
     }
     void makesoud1(){
        System.out.println("woof");
    }

}

public class Puppy extends Dog{
     void makesoud(){
        System.out.println("bark");
    }
    public static void main(String[] args) {
        Puppy obj=new Puppy();
        obj.makesoud();
        obj.makesoud0();
        obj.makesoud1();
       
    
    }
}
