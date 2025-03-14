public class Customer extends User {
    String purchasehistory;

    public Customer(String name,String email,String purchasehistory){
      super(name, email);
        this.purchasehistory=purchasehistory;
    }
    public void display(){
        super.display();
      System.out.println(purchasehistory);
    }

    public static void main(String[] args) {
       Admin obj=new Admin("Ankit", "jayswalankit", 3);
       obj.display();
       Customer obj2=new Customer("ayush", "vermaayush"
       , "Successfull");
       obj2.display();
    }
}
