public class Employe {
    String name;
    int id;

   Employe( String name,int id){
    this.name=name;
    this.id=id;
    System.out.println("name"+name + " id "+id);
   }
    public static void main(String[] args) {
        Employe e1=new Employe("Ankit",101);
        //    System.out.println(e1.name);
        //    System.out.println(e1.id);
           Employe e2=new Employe("Ayush",102);
    }
}
