

public class Dog  extends Animal {
      public void makeSound(String word){
        System.out.println("bark...");
      }
      public static void main(String[] args) {
        Dog obj=new Dog();
        obj.makeSound(null);
        
          
      }
}
