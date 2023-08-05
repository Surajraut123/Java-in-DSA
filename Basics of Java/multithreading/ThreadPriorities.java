package multithreading;
class surajThread1 extends Thread {
    public surajThread1(String name) {
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
public class ThreadPriorities {
    public static void main(String[] args) {
//        When JVM runs then Jvm gets a one ReadyQueue
//        Inside the readyqueue will get all the thread whos ready to run t1 t2 t3 t4 jvm responsible
        //We can give three type of priority
        /*
        * 1) MIN_PRIORITY=1
        * 2) NORM_PRIORITY=5
        * 3) MAX_PRIORITY=10 it will get max priority
        * */

        surajThread1 th= new surajThread1("Suraj");

        surajThread1 th1= new surajThread1("Raut");

        surajThread1 th2= new surajThread1("Suaj");
        th1.setPriority(Thread.MAX_PRIORITY);
        th.setPriority(Thread.MIN_PRIORITY);

        th.start();
        th1.start();
        th2.start();



    }
}
