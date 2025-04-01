package oopspdf.Inheritance.One;

 class Animal {
    public void makesound(){
        System.out.println("ayush loves ashika");
    }
}
public class Dog extends Animal{
    public void makesound (){
     System.out.println("ayush loves nisha too");
}
public static void main(String[] args) {
    Dog obj=new Dog();
    obj.makesound();
}
}
