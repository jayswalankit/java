 import java.util.*;
public class Student {
    private String name;
    private Integer rollNumber;
    private int[] marks;

    Student(String name,Integer rollNumber,int[]marks){
                this.name=name;
                this.rollNumber=rollNumber;
                this.marks=marks;
           
             }

    public void setMarks(int[] marks) {
        int flag = 1;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 0 || marks[i] > 100) {
                flag = 0;
                System.out.println("invalid marks");
                break;
            }
        }
        if (flag == 1) {
            this.marks = marks;
        }
    }
  
    public int   Average(){
        if(marks.length==0){
            System.out.println("marks are not set yet");
            return 0;
        }
        int sum=0;
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
           
        }
        return sum/marks.length;
    }

    public void grade(){
        int average=Average();
        if(average>=90){
            System.out.println("A");
        }
        else if(average>=80||average<=89){
            System.out.println("B");
        }
        else if(average>=70||average<=79){
            System.out.println("C");
        }
        else if(average>=60|| average<=69){
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }
          public static void main(String[] args) {
            Scanner sc=new Scanner (System.in);
            System.out.println("enter your name");
            String name=sc.nextLine();
            System.out.println("enter your rollno");
             Integer rollNumber=sc.nextInt();
             System.out.println("enter no of subject");
             int subject=sc.nextInt();
             int [] marks=new int[subject];
             System.out.println("enter your marks");
             for(int i=0;i<subject;i++){
                  System.out.println("subject" +(i+1));
                  marks[i]=sc.nextInt();

             }
             Student obj=new Student(name, rollNumber, marks);
             obj.setMarks(marks);
             int average =obj.Average();
             System.out.println(average);
             obj.grade();
          }
}
