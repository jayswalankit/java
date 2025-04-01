

public class Manager extends Employee {
     int  teamsize;
   Manager(String name,int id,double salary,int teamsize){
    super(name, id, teamsize);
    this.teamsize=teamsize;
   }
   @Override
   double calculatebonus(){
    return  salary *0.05*teamsize;
   }
   
}
