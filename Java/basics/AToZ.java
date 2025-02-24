import java .util.Scanner;
public class AToZ {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter yoour char");
        String input=sc.nextLine();
        char x=input.charAt(0);
       if(x>='a'&&x<='z'){
        char y='z';
        while(x<=y){
          System.out.println(x);
          x++;
      }

       }
       
      }
        
      
}
