
import java.util.Scanner;
public class Library2 {
    String name;
    String location;
    int booksAvailable;
    double membershipFee;

    public void borrowBook(){
         Scanner sc=new Scanner(System.in);
         System.out.println("Books available after borrowing: " + booksAvailable);
         int borrowbook=sc.nextInt();
            booksAvailable-=borrowbook;
         System.out.println("new" + booksAvailable);
       
    }

    public void returnBook(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of books to return:");
        int returnbook=sc.nextInt();
        booksAvailable+=returnbook;
        System.out.println("new" + booksAvailable);
      
   }

    public void Detail(){
        System.out.println(" Name " + name);
        System.out.println(" Location " + location);
        System.out.println("Book available" + booksAvailable);
        System.out.println("Fee for library per hour " + membershipFee);
        borrowBook();
        returnBook();
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Library2 obj = new Library2();
        System.out.println("enter your library name");
        obj.name=sc.nextLine();

        System.out.println(" enter your library location ");
        obj.location=sc.nextLine();

        System.out.println("total book is available");
        obj.booksAvailable=sc.nextInt();

        System.out.println(" charge  of library per hour");
        obj.membershipFee=sc.nextDouble();

        

        obj.Detail();
       
        

    }
}

