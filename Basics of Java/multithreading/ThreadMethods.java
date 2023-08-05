package multithreading;
class threadM1 extends Thread {
    public threadM1(String name) {
        //Bz the Thread, it already have an one constructor which takes a string values
        super(name);
    }
    public void run() {
//        int i=40
        System.out.println("Thank you" + this.getName());
//        while (true) {
//            System.out.println("I am Thread");
//        }
    }
}

public class ThreadMethods {
    public static void main(String[] args) {
        threadM1 th= new threadM1("Suraj");

        threadM1 th1= new threadM1("Raut");
        th.start();
        try{
            //It will complete first th then th1 will start
            th.join();
        } catch(Exception e) {

        }

        th1.start();
    }
}
