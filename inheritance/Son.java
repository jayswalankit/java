public class Son extends Father {
    public void SonName(){
        System.out.println("Ankit jayswal");
    }
    public static void main(String[] args) {
        Son obj = new Son();
        obj.SonName();
        obj.fatherName();
        obj.familyName();
    }
}
