import java.util.Objects;

public class book extends Library4{
      String author;
   public book(String title,Integer  year,int id,String author){
      super(title,year,id);
      this.author=author;
   }
   public void setAuthor(String a){
    author =a;
   }
   public String getAuthor(){
    return author;
   }

   public void display(){
      super.display();
    System.out.println(getAuthor());
   }
   public String toString(){
    return getTitle()+getYear()+getId()+getAuthor();
    

   }
}
