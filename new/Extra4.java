public class Extra4 {
    
        String name;
        int age;
         public Extra4(String name,int age){
          this();
           System.out.println(name + age);
         
    
         }
         public Extra4(){
       
           this. name="azad";
           this.age =32;
           System.out.println(name);
           System.out.println(age);
         }
          
public String toString(){
    return name+age;
}
    
         public static void main(String[] args) {
            Extra4 obj=new Extra4("ankit",23);
            Extra4 obj2=new Extra4();
            System.out.println(obj);
            System.out.println(obj2);
         
         }
    
    
}







