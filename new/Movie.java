import java.util.Scanner;

public class Movie {
    private String title;
    private String genere;
    private int duration;
    private double rating;

    public Movie(String title, String genere, int duration, double rating) {
        this.title = title;
        this.genere = genere;
        this.duration = duration;
        this.rating = rating;
    }

    public String getTitle() {
        return title;

    }

    public void setTitle(String t) {
        title = t;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String g) {
        genere = g;
    }

    public int getDuration() {
        return duration;

    }

    public void setDuration(int d) {
        duration = d;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double r) {
        rating = r;
    }

    public void watch(String w) {
        System.out.println(w);
    }

    public void newrating(double n) {
        System.out.println(rating + " old rating " + n + " new rating ");
        

    }

    public void Details() {

        System.out.println("Title" + getTitle());
        System.out.println("Genere" + getGenere());
        System.out.println("Duration" + getDuration());
        System.out.println("Rating" + getRating());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie obj = new Movie(null, null, 0, 0);
        System.out.println("enter your movie title");
        obj.setTitle(sc.nextLine());

        System.out.println("enter your genere");
        obj.setGenere(sc.nextLine());

        System.out.println("enter your duration");
        obj.setDuration(sc.nextInt());

        System.out.println("enter your rating");
        obj.setRating(sc.nextDouble());
        sc.nextLine();

        System.out.println("enter your messege");
        String w = sc.nextLine();

        System.out.println("enter your new rating");
        double d = sc.nextDouble();

        // obj.Details();
        obj.watch(w);
        obj.newrating(d);
    }
}
