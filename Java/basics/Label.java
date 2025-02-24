import java.util.Scanner;
public class Label{
 public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    outerLoop:for( int i=0;i<5;i++){
        for(int j=0;j<5;j++){
            if(i==2&&j==2){
                break outerLoop;
            }
            System.out.println("i="+i+",j="+j);
        }
    }
 }
}

