
  
import java.util.*;
public class Library4 {
    private String title;
    private Integer year;
    private final int id;

    public Library4(String title, Integer year, int id) {
        this.title = title;
        this.year = year;
        this.id = id;
    }
    public void setTitle(String t) {
        title = t;
        
    }

    public String getTitle() {
        return title;
    }

    public void setYear(Integer y) {
        year = y;
    }

    public int getYear() {
        return year;
    }

    public int getId() {
        return id;
    }

    public void display(){
        System.out.println(getTitle());
        System.out.println(getYear());
        System.out.println(getId());

    }
    
}
  

