public class Extra1 {
    String name;
    int age;

     public Extra1(String name,int age){
      this.name=name;
      this.age=age;
      System.out.println(name);
      System.out.println(age);
     }

     public Extra1(){
        name="ankit";
        age=14;
        System.out.println(name);
      System.out.println(age);
     }

    //  public void Detail(){
        // System.out.println(name);
        // System.out.println(age);
    //  }
     public static void main(String[] args) {
        Extra1 obj=new Extra1();
        // obj.Detail();
      
      Extra1 obj2=new Extra1("Aysush", 43);
    //   obj2.Detail();
       
     }
}
