public class Main334 {
    public static void main(String[] args) {

        Person2 obj = new Person2("Ayush", 32);
    System.out.println(obj); 
    System.out.println("Person HashCode: " + obj.hashCode());

    Employee3 obj2 = new Employee3("Ayush", 32, 3);
    System.out.println(obj2);
//    System.out.println(obj2.getName());
//    System.out.println(obj2.getEmployeeage());
    System.out.println("Employee HashCode: " + obj2.hashCode());
}
}
