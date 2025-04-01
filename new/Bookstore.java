
import java.util.Scanner;
public class Bookstore {
    private String name;
    private String address;
    private int bookstoke;
    private double rating;

 Bookstore(String name,String address,int bookstoke,double rating){
    this.name=name;
    this.address=address;
    this.bookstoke=bookstoke;
    this.rating=rating;
}
public String getName(){
    return name;
}
public void setName(String n){
   name=n;
}

public String getAddress(){
    return address;
}

public void setAddress(String a){
    address=a;
}

public int getBookstock(){
    return bookstoke;
}

public void setBookstock(int b){
    bookstoke=b;
}

public double getRating(){
    return rating;
}

public void setRating(double r){
    rating=r;
}

public void sell(int numbersold){
    this.bookstoke-=numbersold;
   
    System.out.println(numbersold + " book sold" + bookstoke + " book in stock remain after sold");
  
}

public void add(int numberadd){
    this.bookstoke+=numberadd;
    System.out.println(numberadd + " book add " + bookstoke + " book in stock remain after adding books");
    
  
    
}

 public void Detail(){
    System.out.println(" Name " + getName());
    System.out.println(" Address " + getAddress());
    System.out.println(" Book in stock " + getBookstock());
    System.out.println(" Rating " + getRating());
 }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      
    Bookstore obj=new Bookstore(null, null, 0, 0);
    System.out.println("enter your name");
    obj.setName(sc.nextLine());

    System.out.println("enter youur address");
    obj.setAddress(sc.nextLine());

    System.out.println("enter how many books in stock");
    obj.setBookstock(sc.nextInt());

    System.out.println("enter your rating ");
    obj.setRating(sc.nextDouble());

    sc.nextLine();

    System.out.println("enter how many book you want to sell");
     int c=sc.nextInt();

     System.out.println("enter how many book you want to add");
     int d=sc.nextInt();
      
     obj.Detail();
     obj.sell(c);
     obj.add(d);

    }

}
