import java.util.Objects;

public class Person2 {
    private String name;
    private Integer employeeage;

     public Person2(String name,Integer employeeage){
        this.name=name;
        this.employeeage=employeeage;
    }

    public void setName(String name){
        name=name;
    }
    public String getName(){
        return name;
    }
    public void StetEmployeeage(Integer employeeage){
     employeeage=employeeage;
    }
    public int getEmployeeage(){
        return employeeage;
    }
    public String toString(){
        // return getName()+getEmployeeage();
       return name+employeeage;
    }

    public int hashCode() {
    //   return name.hashCode()+employeeage.hashCode();
    return Objects.hash(name,employeeage);
    }

}
