class Employee {
    private String name;
    private int id;
    private String department;
    private double salary;

    public Employee(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee Details:\n" +
               "Name: " + name + "\n" +
               "ID: " + id + "\n" +
               "Department: " + department + "\n" +
               "Salary: " + salary;
    }

    public static void main(String[] args) {
        Employeee emp = new Employeee("John Doe", 12345, "Engineering", 75000);
        System.out.println();
    }
}

