public class Question2 {

public void sum(int n){
  int i=0,sum=0;
  for(int tem=n;tem!=0;tem/=10){
    int rem=tem%10;
        sum+=rem;
  }
  System.out.println(sum);
}

     public static void main(String[] args) {
        Question2 q2=new Question2();
     q2.sum(1232);
}
}
