public class Employee extends Person {
    int salary;
    public Employee(String name,int salary){
        super(name);
        this.salary=salary;
    }

    public void display(){
        super.display();
        System.out.println(100000 + salary);
    } 
    public static void main(String[] args) {
        Employee obj=new Employee("Ayush", 50000);
        obj.display();
    }
}



