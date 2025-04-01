public class Student {
     private String name;
     private int rollNo;
     private int marks;

     Student(String name,int rollNo,int marks){
        this.name=name;
        this.rollNo=rollNo;
        this.marks=marks;
     }
     public void setName(String name){
       this.name=name;
     }
    public String getName(){
    return this.name;
    }

    public void setRollNo(int rollNo){
      this.rollNo=rollNo;
     }
     public int getRollNo(){
     return this.rollNo;
     }

     public void setMarks(int marks){
     this.marks=marks;
    }
    public int getMarks(){
    return marks;
    }

    public static void main(String[] args) {
      Student obj=new Student("Ankit", 18, 20);
      // obj.setName(null);
      // obj.setRollNo(0);
      // obj.setMarks(0);
   System.out.println(obj.getName());
   System.out.println(obj.getRollNo());
   System.out.println(obj.getMarks());
    }
     
}
