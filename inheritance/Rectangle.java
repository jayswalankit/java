public class Rectangle extends Shape{

    public void draw(){
        System.out.println("rectangle is drawn");
    }
    public static void main(String[] args) {
        // Shape obj=new Circle();
        // obj.draw();
       

        // Shape obj2=new Rectangle();
        // obj2.draw();

        
          Circle obj=new Circle();
            obj.draw();
           
    
            Rectangle obj2=new Rectangle();
            obj2.draw();
    }
   
    }

    

// bina extend kiye bhi object ban jata hai to aur print bhi to extend ka use kya hai ;;;