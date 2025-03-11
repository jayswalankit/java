import java.util.Scanner;

public class Question4 {

    public int gcd(int n, int m) {
        if (m == 0) {
            return n;
        }
        return gcd(m, n % m);
    }

    public int lcm(int n, int m) {
        return (n * m) / gcd(n, m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = sc.nextInt();
        System.out.println("Enter your number:");
        int m = sc.nextInt();
        Question4 q4 = new Question4();
        int ans = q4.lcm(n, m);
        System.out.println(ans);
        sc.close();
    }
}
