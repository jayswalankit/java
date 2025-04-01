public  class QWE {
    String busname;

    QWE(String busname) {
        this.busname = busname;
    }

    public void nam(String nam) {
        System.out.println("hello");
    }

    public void nam(int num) {
        System.out.println(12);
    }
    

    public static void main(String[] args) {
        QWE obj=new QWE("AYUSH");
        obj.nam("AYUSh");
       obj.nam(12);
    }
}

// class ConcreteQWE extends QWE {
//     ConcreteQWE(String busname) {
//         super(busname);
//     }
// }




