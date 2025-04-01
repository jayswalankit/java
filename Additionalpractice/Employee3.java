public class Employee3 extends Person2 {
    private int id;
 
    public Employee3(String name,Integer employeeage,int id){
       super(name,employeeage);
           this.id=id;
    }
    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

    public String toString(){
        return super.toString()+id;
    }

    public int hashCode() {
        return super.hashCode() + id;
    }
      }



