

public class Calculator {
    public void add(int a,int b){
       int sum=a+b;
       System.out.println(sum);

    }
    public void add(int a,int b,int c){
        int sum=a+b+c;
        System.out.println(sum);
    }

    public void add(int a,int b,int c,int d){
        int sum=a+b+c+d;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Calculator obj=new Calculator();
        obj.add(2,3,4,5 );
        obj.add(2,3);
        obj.add(1,2,3);
    }

}
