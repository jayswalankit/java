
abstract class Computer {
     abstract void start();

     static class Processor{
        void process(){
            System.out.println("processing data");
        }
     }
}

class Laptop extends Computer{
    @Override
    void start(){
        System.out.println("Laptop is starting");
    }
    public void useProcessor(){
        Processor obj=new Processor();
        obj.process();
    }

    public static void main(String[] args) {
        Laptop obj=new Laptop();
     obj.start();
     obj.useProcessor();
    }
}