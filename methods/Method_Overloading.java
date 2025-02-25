

public class Method_Overloading {
    void m1(int a){
        System.out.println("Integer: " + a);
    }

    void m1(String str){
        System.out.println("String: " + str);
    }

    public static void main(String[] args) {
        Method_Overloading obj= new Method_Overloading();

        obj.m1(34);
        obj.m1("Chhotu");
}
}