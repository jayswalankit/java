
import java .util.Scanner;
public class Hotel {
    String name;
    String location;
    int roomsAvailable;
    double rating;


    public void bookroom(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the room you want to book");
      int r=sc.nextInt();
       roomsAvailable-=r;
     System.out.println(r + " total room " + roomsAvailable +" total remaining room after book room ");
    }

    public void cancleroom(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of room you want to cancle");
        int c=sc.nextInt();
        roomsAvailable+=c;
        System.out.println(c + "total room " +  roomsAvailable + " total room remaining after cancling room");
    }
    public void Detail(){
     System.out.println("Name" + name);
     System.out.println("Location" + location);
     System.out.println("Rooms Availability" + roomsAvailable);
     System.out.println("Rating" + rating);
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Hotel obj=new Hotel();
        System.out.println("enter your Hotel name");
        obj.name=sc.nextLine();
        System.out.println("enter your hotel location");
        obj.location=sc.nextLine();
        System.out.println("enter your rooms availbility");
        obj.roomsAvailable=sc.nextInt();
        System.out.println("enter your rating");
        obj.rating=sc.nextDouble();
        

        

    obj.Detail();
    obj.bookroom();
     obj.cancleroom();

     }

}
