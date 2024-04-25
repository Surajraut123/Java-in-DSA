package multithreading;
class myThread extends Thread {
    @Override
    public void run(){

        while(true) {
            //Thread will give some time for this
            System.out.println("My thread is running");
        }
    }
}
class myThread2 extends Thread {
    @Override
    public void run(){

        while(true) {
            //some time for this
            System.out.println("My thread2 is running");
        }
    }
}
public class ThreadDemo {
    public static void main(String []args) {
        //Threads uses a shared memory
        //Threads interacts fast and faster content switching
        //Threads are lightweight where as process is heavyweight
        //Threads helps to occur concurrency

        //Concurrency : is the task to running and managing the multiple computations at the same time

        //Parallelism : running multiple computations simultaneously

        // Creating thread two ways
        // By extending thread class
        // By implementing runnable interface

        //Thread can execute code simultaneously


        myThread th = new myThread();
        myThread2 th1 = new myThread2();

        th.start();
        th1.start();
    }
}
