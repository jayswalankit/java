public class Child2 extends Parent2 {
    public void son2(){
        System.out.println("son 2");
    }
   
    public static void main(String[] args) {
        Child2 obj=new Child2();
        
        obj.parent();
        obj.son2();
        Child1 obj1=new Child1();
        obj1.son();
        obj.parent();
    }
}
