class parent{
 protected void show(){
    System.out.println("protected method call");
 }
}

class child extends parent{
    public static void main(String[] args) {
        child obj=new child();
        obj.show();
    }
}