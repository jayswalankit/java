

public class Developer  extends Employee{
      String skillLevel;
      Developer(String name ,int id,double salary,String skillLevel){
        super(name, id, salary);
        this.skillLevel=skillLevel;
      }
      @Override
    double calculatebonus(){
        switch (skillLevel) {
            case "junior":
                return salary*0.05;
             
               case "mid":
               return salary*0.10;
           
               case "senior":
               return salary*0.15;
            default:
             System.out.println("no bonus ");
             break;
        }
    }

}
