
class Student {
    private String studentId;
    private String name;
    private Character grade; 


    public Student(String studentId, String name, Character grade) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
    }

   
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getGrade() {
        return grade;
    }

    public void setGrade(Character grade) {
        this.grade = grade;
    }

    
    @Override
    public int hashCode() {
        return studentId.hashCode();
    }


    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + name + ", Grade: " + grade;
    }
}

class GraduateStudent extends Student {
    private String thesisTitle;

  
    public GraduateStudent(String studentId, String name, Character grade, String thesisTitle) {
        super(studentId, name, grade);
        this.thesisTitle = thesisTitle;
    }

  
    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

  
   
    @Override
    public String toString() {
        return super.toString() + ", Thesis Title: " + thesisTitle;
    }
}


public class Main {
    public static void main(String[] args) {
 
        Student student = new Student("001", "Ankit", 'A');
        System.out.println("Student Details: " + student.toString());
        System.out.println("HashCode of Student: " + student.hashCode());

     
        GraduateStudent gradStudent = new GraduateStudent("001", "Ankesh", 'A', "Codingage");
        System.out.println("Graduate Student Details: " + gradStudent.toString());
        System.out.println("HashCode of Graduate Student: " + gradStudent.hashCode());
    }
}
