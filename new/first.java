//tostring=returns a text representation of an object
public class first {
    int id;
    String name;
    first(int id,String name){
        this.id=id;
        this.name=name;
    }
    // public String toString(){
    //  return "Student{id="+ id +", name='" + name +" '}";
    // }
    public String toString(){
        return "Studentid=" + id + " name="+name;
}
    public static void main(String[] args) {
        first h1=new first(1,"Ankit");
        System.out.println(h1.toString());//print key value pair
        

        // System.out.println(h1.hashcode());
        // System.out.println(ro.hashcode());
}
}