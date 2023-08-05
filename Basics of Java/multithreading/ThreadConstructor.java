package multithreading;

class surajThread extends Thread {
    public surajThread(String name) {
        //Bz the Thread, it already have an one constructor which takes a string values
        super(name);
    }
    public void run() {
//        int i=40
//        while (true) {
//            System.out.println("I am Thread");
//        }
    }
}
public class ThreadConstructor {
    public static void main(String[] args) {
        surajThread th= new surajThread("Suraj");
        th.start();

        //To get Thread id
        System.out.println("The id of the thread is : "+ th.getId());
        System.out.println("The name of the thread is : "+ th.getName());
    }
}
