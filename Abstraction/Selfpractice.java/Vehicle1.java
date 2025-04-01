

abstract class Vehicle1 {
      String brandname;

      Vehicle1 (String brandname){
        this.brandname=brandname;
      }
      abstract void  name(String name);
      public void bikename(){
        System.out.println("BMW 1000R "+ brandname);
      }

}
