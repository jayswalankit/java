public class Extra3 {
    String brand;
    String name;

    public Extra3(String b,String n){
        this.brand=b;
        this.name=n;
    }
    public void Detail(){
        System.out.println(" brand " + brand);
        System.out.println(" name " + name);
    }

    public static void main(String[] args) {
     Extra3 obj=new Extra3("Toyota", "Supra");
     
     obj.Detail();
    }
}
