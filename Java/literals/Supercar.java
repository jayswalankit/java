class Supercar{
    String name="dodge";
    String  brand="ford";
    void Supercarprice(){
        name="dodge";
        brand="ford";
        System.out.println("name"+name+"brand"+brand+"price=3000");
    }
    public static void main(String[] args) {
        Supercar s1=new Supercar();
        s1.Supercarprice();

    }
}

