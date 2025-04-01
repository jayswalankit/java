public class Person {
    private int age;

    public Person(int age){
        this.age=age;
    }
    public void setAge(int age){
        if(age<=0){
            System.out.println("invalid age");
        }
        else{
            this.age=age;
        }
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        Person obj=new Person(12);
        System.out.println(obj.getAge());
        obj.setAge(-5);
        System.out.println(obj.getAge());
    }
}
