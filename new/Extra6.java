import java.util.Objects;

public class Extra6 {
    String name;
    int rollno;

    public Extra6(String n,int r){
           this.name=n;
           this.rollno=r;
    }
    public String toString(){
        return ("Name :" + name + " Rollno: " +  rollno);
    }

    public int hashCode(){
        return Objects.hash(name , rollno);
    }
    public static void main(String[] args) {
        Extra6 obj=new Extra6("Ankit", 18);
        Extra6 obj2=new Extra6("Ankit", 18);
        System.out.println(obj);
        System.out.println(obj.hashCode());
        System.out.println(obj2);
        System.out.println(obj2.hashCode());
    }
}









