import java.util.Objects;

public class Extra5 {
  int  id;
  String name;

  public Extra5(int id,String name){
    this.id=id;
    this.name=name;
 }

 public int hashCode(){
    return  Objects.hash(id,name);
 }
 public static void main(String[] args) {
    Extra5 obj=new Extra5(3,"ankit");
    System.out.println(obj);
    Extra5 obj2=new Extra5(3,"ankit");
    System.out.println(obj2);
 }
}
 
// note .hashcode sout me dolo ya nhi usse koi issue nhi hai bss hexa decimal me nhi dega 

