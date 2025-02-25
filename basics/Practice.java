
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string");
//        String a=sc.nextLine();
        char ch=sc.next().charAt(0);
        ch=(char)(ch-32);
        System.out.println(ch);

    }
}

