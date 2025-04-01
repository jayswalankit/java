import java.util.*;

public class Mainiac {
    public static void main(String[] args) {
        book b1 = new book("romantic ", 2000, 2, "Gulzar");
        Magazines m1 = new Magazines(" Forbes India", 2005, 3, 2);
        System.out.println("book");
        b1.display();
        b1.toString();

        System.out.println("magazines");
        m1.display();
        m1.toString();
        System.out.println(b1);

        System.out.println(m1);

    }
}
