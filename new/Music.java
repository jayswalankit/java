
//  import java.util.Scanner;
// public class MusicAlbum {
     
// }



import java.util.Scanner;

public class Music {
    String name;
    String location;
    int roomsAvailable;
    double rating;

    public void bookRoom() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rooms you want to book:");
        int r = sc.nextInt();
        roomsAvailable -= r;
        System.out.println("Total remaining rooms after booking: " + roomsAvailable);
    }

    public void cancelRoom() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rooms you want to cancel:");
        int c = sc.nextInt();
        roomsAvailable += c;
        System.out.println("Total remaining rooms after cancelling: " + roomsAvailable);
    }

    public void detail() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Rooms availability: " + roomsAvailable);
        System.out.println("Rating: " + rating);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Music obj = new Music();

        System.out.println("Enter your hotel name:");
        obj.name = sc.nextLine();
        System.out.println("Enter your hotel location:");
        obj.location = sc.nextLine();
        System.out.println("Enter your rooms availability:");
        obj.roomsAvailable = sc.nextInt();
        System.out.println("Enter your rating:");
        obj.rating = sc.nextDouble();

        obj.detail();
        obj.bookRoom();
        obj.cancelRoom();
    }
}
