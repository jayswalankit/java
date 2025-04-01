

 interface Swimmable {
void swim();
} 

 interface Diveable   {
    void dive();
}

 public class Dolphine implements Swimmable,Diveable   {

   public  void swim(){
        System.out.println("dolphine is swimminng");
    }

     public void dive(){
        System.out.println("dolphine is diving");
    }
    public static void main(String[] args) {
        Dolphine obj=new Dolphine();
        obj.swim();
        obj.dive();
    }
}
