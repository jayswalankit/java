import java.util.Scanner;

public class nine {
    public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter your character");
     String input=sc.nextLine();
     char ch=input.charAt(0);
     ch=(char)(ch-32);
     System.out.println(ch);
    }
}
