public class Manager extends Employeee {
    int bonus;
    Manager(String name, int salary, int bonus){
        super(name, salary);
        this.bonus = bonus;
    }
    public static void main(String[] args) {
        Manager obj=new Manager("ANkit", 200000, 15000);
          System.out.println(obj.getName());
          System.out.println(obj.getSalary());
          System.out.println(obj.bonus);
    }
} 

