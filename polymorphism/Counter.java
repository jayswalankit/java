
public class Counter {
      static int count =0;
      int instanceCount =0;
    
      static void  incrementCount(){
        count++;
        
      }
      static int getincrementCount(){
        return count;
      }
      void incrementInstanceCount(){
          instanceCount++;
         
      }
       int getInstanceCount(){
        return instanceCount;
      }
    public static void main(String[] args) {
        Counter obj=new Counter();
        Counter obj2=new Counter();
       obj.incrementInstanceCount();
       obj2.incrementInstanceCount();
       Counter .incrementCount();
       Counter .incrementCount();
      System.out.println(getincrementCount());
      System.out.println(obj.getInstanceCount());
      System.out.println(obj2.getInstanceCount());
      System.out.println(getincrementCount());
      
      

       
        
    }
    
}
