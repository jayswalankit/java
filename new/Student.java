

public class Student {
    private int age;

    public void setage(int age){
        this.age=age;
    }

    public int getage(){
        return age;
    }
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setage(19);
        System.out.println(s1.getage());
    }
}


