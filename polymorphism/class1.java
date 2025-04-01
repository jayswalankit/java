

public class class1 {
    int add(int a,int b){
        
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        class1 obj=new class1();
        System.out.println(obj.add(3, 4));
        System.out.println(obj.add(5,6,7));
    }
}
