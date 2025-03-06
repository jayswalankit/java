
import java.util.Scanner;
public class Library {
    String name;
    String location;
    int booksAvailable;
    double membershipFee;

    public void borrowBook( int borrowbook){
         booksAvailable-=borrowbook;
         System.out.println(borrowbook + "book is borrowing " + booksAvailable + " total book available after borrowing");
    }

    public void returningBook(int returningbook){
        booksAvailable+=returningbook;
        System.out.println(returningbook + "book is returning " + booksAvailable + " total book available after returning");
    }

    public void Detail(){
        System.out.println(" Name " + name);
        System.out.println(" Location " + location);
        System.out.println("Book available" + booksAvailable);
        System.out.println("Fee for library per hour " + membershipFee);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Library obj = new Library();
        System.out.println("enter your library name");
        obj.name=sc.nextLine();

        System.out.println(" enter your library location ");
        obj.location=sc.nextLine();

        System.out.println("total book is available");
        obj.booksAvailable=sc.nextInt();

        System.out.println(" charge  of library per hour");
        obj.membershipFee=sc.nextDouble();

        System.out.println("enter no of book you want to borrow");
        int a=sc.nextInt();

        System.out.println("enter no of book customer return");
        int b=sc.nextInt();

        obj.Detail();
        obj.borrowBook(a);
        obj.returningBook(b);
        

    }
}
