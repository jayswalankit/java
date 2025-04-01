import java.util.Scanner;

public class Question9 {

    public void table1(int n) {
        int fact = 5, result = 0;
        for (int i = 1; i <= n; i++) {
            result = fact * i;
            System.out.println(  fact + " * " + i + " = " + result );

        }

    }

    public void table() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your no");
        int n = sc.nextInt();
        table1(n);

    }

    public static void main(String[] args) {
     
        Question9 q9 = new Question9();
        q9.table();
    }
}
