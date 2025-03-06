
import java.util.Scanner;
public class Flight {
    String flightNo;
    String destination;
    int duration;
    int ticketPrice;

  public void board (){
   Scanner sc=new Scanner(System.in);
   System.out.println("enter your bording messege" );
   String g=sc.nextLine();
   System.out.println("bording messege " + g);
   
  }

  public void updateTicketPrice(double u){
//    Scanner sc=new Scanner(System.in);
System.out.println(ticketPrice + "=old ticket price" + u +"=new ticket price");

  }
  public void Details(){
   System.out.println(" Flight number " + flightNo);
   System.out.println(" Destination place " + destination);
   System.out.println(" Total time to reach your destination place " + duration);
   System.out.println(" ticket price " + ticketPrice);

  }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        Flight obj=new Flight();
        System.out.println("enter flight no");
        obj.flightNo=sc.nextLine();

        System.out.println("enter your destination place");
        obj.destination=sc.nextLine();

        System.out.println("enter your duration");
        obj.duration=sc.nextInt();

        System.out.println("enter your ticket price");
        obj.ticketPrice=sc.nextInt();
          
        

        System.out.println("enter your new ticket price that has updated");
        double h=sc.nextDouble();
       

        obj.Details();
        obj.board();
        obj.updateTicketPrice(h);
    }

}
