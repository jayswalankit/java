public class Dog extends Mammal {
    public void bark(){
        System.out.println("dog is barking");
    }
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.bark();
        obj.breath();
        obj.eat();
    }
}
