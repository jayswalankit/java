import java.util.*;

public class practice {
    String name;
    int marks;

    public practice(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println(name);
        System.out.println(marks);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your size");
        int input = sc.nextInt();
        sc.nextLine();
        practice[] students = new practice[input];
        for (int i = 0; i < students.length; i++) {
            System.out.println("enter your name");
            String name = sc.nextLine();
            System.out.println("enter your marks");
            int marks = sc.nextInt();
            sc.nextLine();
            students[i]=new practice(name, marks);
        }
        for (int i = 0; i < students.length; i++) {
         System.out.println(students[i].name);
         System.out.println(students[i].marks);
            
        }

    }
}
