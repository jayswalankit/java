
public class Cat extends Animal {
   public void makeSound(String are){
     System.out.println("Mew Mew ");
   }   
   public static void main(String[] args) {
    Cat obj=new Cat();
    obj.makeSound("hello");
    obj.makeSound("wow");
   }
}
