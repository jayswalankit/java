import java.util.Scanner;
 class Bike2 {
    private String name;
     private String Class;
    void bike(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        name=sc.nextLine();
        System.out.println("enter your class");
        Class=sc.nextLine();

       System.out.println("name is : "+name +" class is: "+Class); 
    }
    public static void main(String[] args) {
        Bike2 b1 =new Bike2();
       b1.bike();
    }

    
}
