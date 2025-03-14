public class Employeee {
   private String name;
   private int salary;

   Employeee(String name,int salary){
   this.name=name;
   this.salary=salary;
   }
   public String getName(){
    return name;
   }
   public void setName(String n){
    name=n;
   }
   public int getSalary(){
    return salary;
   }
   public void setSalary(int s){
    salary=s;
   }
}
