
import java.util.Scanner;
public class Student1 {

private String name;
private int rollno;
private String grade;
private int marks;


public Student1(String name,int rollno,String grade,int marks){
    this.name=name;
    this.rollno=rollno;
    this.grade=grade;
    this.marks=marks;
}
public String getName(){
    return name;
}
public int  getRollno(){
    return rollno;
}
public String getGrade(){
    return grade;
}
public int getMarks(){
    return marks;
}
public void setName(String name){
    this.name=name;
}

public void setRollno(int rollno){
    this.rollno=rollno;
}
public void setGrade(String grade){
    this.grade=grade;
}

public void setMarks(int marks){
    this.marks=marks;
}
public void study(int hours) {
    System.out.println(name + " studied for " + hours + " hours.");
}
public void exam(int score){
          setMarks(score);
          System.out.println(name + " scored " + score + " marks in the exam.");
}


    public void printStudentDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Roll Number: " + getRollno());
        System.out.println("Grade: " + getGrade());
        System.out.println("Marks: " + getMarks());
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
    Student1 student=new Student1(null, 0, null, 0);



   System.out.println("Enter the student's name: ");
        student.setName(sc.nextLine());

        System.out.println("Enter the student's roll number: ");
        student.setRollno(sc.nextInt());

        System.out.println("Enter the student's grade: ");
        student.setGrade(sc.next());

        System.out.println("Enter the student's marks: ");
        student.setMarks(sc.nextInt());


        System.out.println("Enter the number of hours the student studied: ");
        int hours = sc.nextInt();
        student.study(hours);

        System.out.println("Enter the score the student obtained in the exam: ");
        int score = sc.nextInt();
        student.exam(score);

        student.printStudentDetails();
    }  
}









