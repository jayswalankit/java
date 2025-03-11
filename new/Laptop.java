import java.util.Scanner;

public class Laptop {
    String brand;
    String model;
    int ramsize;
    int storagesize;

    public Laptop(String brand,String model,int ramsize,int storagesize){
        this.brand=brand;
        this.model=model;
        this.ramsize=ramsize;
        this.storagesize=storagesize;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String b){
      brand=b;
    }
    public String getModel(){
       return model;
    }
    public void setModel(String m){
        model=m;
    }
    public int getRamsize(){
        return ramsize;
    }
    public void setRamsize(int r){
        ramsize=r;
    }
    public int getStoragesize(){
        return storagesize;
    }
    public void setStoragesize(int s){
        storagesize=s;
    }

    public void start(String a){
        System.out.println(a);
    }
    public void upgradeRam(int upgrade){
        System.out.println(ramsize + " old ram " + upgrade+" new ram");
    }

    public void Details(){
        System.out.println("Brand" + getBrand());
        System.out.println("Model" + getModel());
        System.out.println("RamSize" + getRamsize());
        System.out.println("Storagesize" + getStoragesize());
    }

 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Laptop obj=new Laptop(null, null, 0, 0);
    System.out.println("enter brand name: ");
    obj.setBrand(sc.nextLine());
    System.out.println("enter model name: ");
    obj.setModel(sc.nextLine());
    System.out.println("enter ramsize: ");
    obj.setRamsize(sc.nextInt());
    System.out.println("enter storagesize: ");
    obj.setStoragesize(sc.nextInt());

    sc.nextLine();

    System.out.println("enter your message");
    String s=sc.nextLine();
    obj.start(sc.nextLine());

    System.out.println("enter new ram size");
    int upgrade=sc.nextInt();
    obj.upgradeRam(upgrade);

    obj.Details();
 }
}
