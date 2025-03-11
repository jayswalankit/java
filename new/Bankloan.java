
import java.util.Scanner;
public class Bankloan {
    String loanType;
    double amount;
    double interest;
    int tenure;

    public void applyForLoan(double newamount){
        amount-=newamount;
     System.out.println(newamount + " amount you paid now   " + amount + " is  your  remaining  amount ");
    }

    public void updateInterest(double newRate){
       
        System.out.println(newRate + " percent is  your new interest rate whereas " + interest +  " percent is your old interest rate " );
    }

    public void Details(){
        System.out.println("Loan type " + loanType);
        System.out.println("Loan amount" + amount);
        System.out.println(" Interest " + interest);
        System.out.println(" Tenure " + tenure);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Bankloan obj=new Bankloan();

        System.out.println("enter which type of loan you want");
        obj.loanType=sc.nextLine();

        System.out.println("enter how much loan you want");
        obj.amount=sc.nextDouble();
       
        System.out.println("enter how much interest you want");
        obj.interest=sc.nextDouble();

        System.out.println("enter for how many years you want loan");
        obj.tenure=sc.nextInt();
          
         System.out.println("enter your  loan amount you want to pay now");
         double l=sc.nextDouble();

         System.out.println("your new interest rate on your loan type is");
         double w=sc.nextDouble();

        obj.Details();
        obj.applyForLoan(l);
        obj.updateInterest(w);
    }
}
