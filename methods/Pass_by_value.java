

public class Pass_by_value {
    public void modify (int num){
        num+=10;
        System.out.println("dublicate value is: "+num);
    }
    public static void main(String[] args) {
        Pass_by_value obj=new Pass_by_value();
        int x=50;
        obj.modify(x);
        System.out.println("original value: "+x);
    }
}
