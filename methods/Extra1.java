public class Extra1 {
    public static  void Greet (){
        System.out.println("hello");
    }
    public void q1(){
        System.out.println("hyyy");
    }
    public void q2(){
       q1();
    }
    public static void w(){
       Extra1 obj2=new Extra1();
       obj2.q1();
    }
    public static void main(String[] args) {
        Extra1.Greet();
        Extra1 obj=new Extra1();
        obj.q2();
        Extra1 obj2=new Extra1();
        obj.q1();
    }
}
