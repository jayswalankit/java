import java.util.Scanner;

class Animal {
    Scanner sc=new Scanner(System.in);
    String name=sc.nextLine();
    String Scientificname=sc.nextLine();

    public static void main(String[] args) {
        System.out.println("enter your detail");
       Animal a1=new Animal();
      System.out.println("enter your detail");
        System.out.println("name of animal"+a1.name + "Scientific name"+a1.Scientificname);


    }
}

