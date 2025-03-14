public class Managerr extends Employ{
     int bonus;

     public Managerr(String name,int salary,int bonus){
        super(name, salary);
        this.bonus=bonus;
     }
     public void display(){
       super.display();
        System.out.println(bonus);
      
     }
     public static void main(String[] args) {
        Managerr obj=new Managerr("Ankit",1000000,10000);
       obj.display();
    


        
     }
}
