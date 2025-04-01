
abstract class BankAccount {
    Double accountno;
    int balance;

    BankAccount(Double accountno,int balance){
        this.accountno=accountno;
        this.balance=balance;
    }
    abstract int withdraw(double amount);
    abstract int deposit(double amount);

    public int displayBalance(){
        System.out.println("current balance " +balance);
        return balance;
    }
}

   class SavingsAccount extends BankAccount{
     double minimumBalance;
     SavingsAccount(Double accountno,int balance,double minimumBalance){
        super(accountno,balance);
        this.minimumBalance=minimumBalance;
     }
     int withdraw(double amount){
        if(balance-amount>=minimumBalance){
            balance-=amount;
            System.out.println("balance aftere withdraw "+ balance);
            
        }
        else{
            System.out.println("balance is less");
        }
        return balance;
     }

     int deposit(double amount){
        balance +=amount;
        System.out.println("balance after deposit "+ balance);
        return balance;
     }

   }

   class CurrentAccount extends BankAccount{
    CurrentAccount(Double accountno,int balance){
        super(accountno, balance);
   }
     int withdraw(double amount){
        balance -= amount;
        System.out.println("balance after withdraw "+balance);
        return balance;
     }
       
     int deposit(double amount){
        balance += amount;
        System.out.println("balance after deposit "+balance);
        return balance;
     }
  public static void main(String[] args) {
    BankAccount obj=new CurrentAccount(12345678.0, 120000);
    obj.displayBalance();
    obj.deposit(2500.0);
    obj.withdraw(1000.0);
   
 

    System.out.println();

    BankAccount savings = new SavingsAccount(12345.0, 1000, 500.0);
    savings.displayBalance();
    savings.deposit(500.0);
    savings.withdraw(800.0);
    
  

  }

   }
