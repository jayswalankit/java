

 public class Bankaccount {
 private double Account_number;
 private Integer Balance;

 public void setAccount_number(double Account_number){
  this.  Account_number=Account_number;
 }
 public double getAccount_number(){
    return Account_number;
 }

 public void setBalance(Integer Balance){
 
   if(Balance <=0){
    System.out.println("current balance is 0" );
    
   }
   else{
  this.  Balance=Balance;
   }
 }
 public Integer getBalance(){
  return Balance;
 }

 public static void main(String[] args) {
    Bankaccount obj =new Bankaccount();
    obj.setAccount_number(12345678);
    System.out.println(obj.getAccount_number());

    obj.setBalance(2500000);
    System.out.println(obj.getBalance());
 }
     
}