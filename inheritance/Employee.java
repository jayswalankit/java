public class Employee extends Person2 {
    int salary;
    public Employee(String name,int salary){
        super(name);
        this.salary=salary;
    }

    public void display(){
        super.display();
        System.out.println( salary);
    } 
    public static void main(String[] args) {
        Employee3 obj=new Employee3("Ayush", 50000);
        obj.display();
    }
}



