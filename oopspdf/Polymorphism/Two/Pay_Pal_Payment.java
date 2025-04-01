

 class Payment {
    public void pay(){
        System.out.println("your amouth is dedectued");
    }
}
       class Credit_Card_Payment extends Payment {
      public void pay(){
        System.out.println("Limit reached");
      }
      public static void main(String[] args) {
        Credit_Card_Payment obj=new Credit_Card_Payment();
       obj.pay();
       obj.pay();
   }
  }

  public    class Pay_Pal_Payment extends Payment {
    public void pay(){
        System.out.println("the amount is payed");
    }
  public static void main(String[] args) {
    Pay_Pal_Payment obj=new Pay_Pal_Payment();
    Pay_Pal_Payment obj2=new Pay_Pal_Payment();
   obj.pay();
    obj2.pay();
    obj.pay();;
  }
  // reference variable me obj ae pehle wale me parent name ho aur new ke baad child nam eto value child ka hi dega ....
   }