import java.util.Scanner;

public class Restaurant {
   private String name;
   private String location;
   private String cuisinetype; 
   private double averagecost;

   public Restaurant(String name,String location,String cuisinetype,double averagecost){
    this.name=name;
    this.location=location;
    this.cuisinetype=cuisinetype;
    this.averagecost=averagecost;
   }

   public String getName(){
    return name;

   }

   public void setName(String n){
    name=n;
   }
   public String getLocation(){
    return location;
   }
   public void setLocation(String l){
    location = l;
   }

   public String getCuisinetype(){
    return cuisinetype;
   }
   public void setCuisinetype(String c){
    cuisinetype = c;
   }

   public double getAveragecost(){
    return averagecost;
   }
  public void setAveragecost(double a){
    averagecost=a;
  }
   
  public void servedish(String d){
    System.out.println(d + " your dish enjoy ");
  }

  public void updatecost(double u){
    System.out.println(averagecost + " average cost"+ u + " Total cost");
  }


  public void Details(){
    System.out.println("Name" + getName());
    System.out.println("Location" + getLocation());
    System.out.println("Cuisine type" + getCuisinetype());
    System.out.println("Average cost " + getAveragecost());
  }



   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Restaurant obj=new Restaurant(null, null, null, 0);
    System.out.println("Enter your  restaurant name");
    obj.setName(sc.nextLine());

    System.out.println("Enter your location");
    obj.setLocation(sc.nextLine());

    System.out.println("enter your cuisinetype");
    obj.setCuisinetype(sc.nextLine());

    System.out.println("Enter your averagecost");
    obj.setAveragecost(sc.nextDouble());
    sc.nextLine();
     
    System.out.println("Enter your dish name");
    String q=sc.nextLine();
   

    System.out.println("enter your total cost");
    double e=sc.nextDouble();
   

      obj.Details();
      obj.servedish(q);
      obj.updatecost(e);


   }
}
