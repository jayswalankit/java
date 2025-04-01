
import java.util.*;
public class Extra {
   String name;
   String title;
   int moblieno;

  public Extra (String name,String title,int moblieno){
    this.name=name;
    this.title=title;
    this.moblieno=moblieno;
  }
   public  String getName(){
      return name;
   }
   public void setName(String n){
    name=n;
   }
   public String getTitle(){
    return title;
   }
   public void setTitle(String t){
    title=t;
   }
   public int getMobileno(){
    return moblieno;
   }
   public void setMobileno(int m){
    moblieno=m;
   }
   public void caste(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your caste");
    String cast = sc.nextLine();
    System.out.println(cast);
   }
   public void job(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your job");
    String Job=sc.nextLine();
    System.out.println(Job);
    
   }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Extra obj=new Extra(null, null, 0);
    System.out.println("enter your name");
    obj.setName(sc.nextLine());
    System.out.println("enter your title");
    obj.setTitle(sc.nextLine());
    System.out.println("enter your mobile number");
    obj.setMobileno(sc.nextInt());
    
    obj.job();
    obj.caste();
    System.out.println("\nDetails Entered:");
    System.out.println("Name: " + obj.getName());
    System.out.println("Title: " + obj.getTitle());
    System.out.println("Mobile Number: " + obj.getMobileno());
   }
}
