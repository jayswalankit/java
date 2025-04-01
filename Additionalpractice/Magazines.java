
public class Magazines extends Library4 {
   int issueno;

   public Magazines(String title, int year, int id, int issueno) {
      super(title, year, id);
      this.issueno = issueno;
   }

   public void setIssueno(int i) {
      issueno = i;
   }

   public int getIssueno() {
      return issueno;
   }

   public void display() {
      super.display();
      System.out.println(getIssueno());
   }

   public String toString() {
      // return getTitle()+getYear()+getId()+getIssueno();
      // return super.toString() + getIssueno();
      return super.toString()+issueno;

   }
}
