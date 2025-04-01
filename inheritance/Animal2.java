public class Animal2 {
   public  void animalsound(){
    System.out.println("bark");
   }
}
   class Animal3 extends Animal2 {
    public void Animalsound2(){
        System.out.println("Dog is barkinng ");
    }
    public static void main(String[] args) {
        Animal3 obj=new Animal3();
        obj.animalsound();

    }
}

