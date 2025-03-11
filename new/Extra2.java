

public class Extra2 {
    String name;
    int age;
     public Extra2(String name,int age){
       this. name=name;
        this.age =age;
        System.out.println(name);
        System.out.println(age);
     }
     public Extra2(){
       this("Ayush",20);
     }

     public static void main(String[] args) {
        Extra2 obj=new Extra2("Ankit",32);
        Extra2 obj2=new Extra2();
     }
}






// public class Extra2 {
//     String name;
//     int age;
//      public Extra2(String name,int age){
//        this. name=name;
//         this.age =age;
//         // System.out.println(name);
//         // System.out.println(age);
//      }
//      public Extra2(){
//        this("Ayush",20);
//      }
//        public void detail(){
//         System.out.println(name);
//         System.out.println(age);
//        }
//      public static void main(String[] args) {
//         Extra2 obj=new Extra2("Ankit",32);
//         obj.detail();
//         Extra2 obj2=new Extra2();
//         obj2.detail();
//      }
// }











// public class Extra2 {
//     String name;
//     int age;
//      public Extra2(String name,int age){
//       this();
//        System.out.println(name + age);
     

//      }
//      public Extra2(){
   
//        this. name="azad";
//        this.age =32;
//        System.out.println(name);
//        System.out.println(age);
//      }

     

//      public static void main(String[] args) {
//         Extra2 obj=new Extra2("ankit",23);
//         Extra2 obj2=new Extra2();
     
//      }
// }
