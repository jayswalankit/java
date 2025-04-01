import java.util.*;
public class Carw {
        String  carname;
      int carno;
     private String carbrand;
      
         Carw(String carname,int carno,String carbrand){
       this. carname=carname;
       this. carno=carno;
       this. carbrand=carbrand;
    }

    public    String getCarname(){
        return carname;
    }
    public    void  setCarname(String carname){
      this.  carname=carname;
  }
 
    public    int getCarno(){
        return carno;
    }
    public  void setCarno(int carno){
       this.carno=carno;
  }
    
    public String getCarbrand(){
        return carbrand;
    }
    public void setCarbrand(String carbrand){
        this.  carbrand=carbrand;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       Carw obj = new Carw(null, 0, null);
           System.out.println("enter your car name");
        obj. setCarname(sc.nextLine());
          System.out.println("enter your car number");
        obj.setCarno(sc.nextInt()); 
          sc.nextLine();
          System.out.println("enter your car brand");
          obj.setCarbrand(sc.nextLine());
             

          System.out.println(obj.getCarname());
          System.out.println(obj.getCarno());
          System.out.println(obj.getCarbrand());
        }
}




//  static rahega to direct call nhi hoga....
