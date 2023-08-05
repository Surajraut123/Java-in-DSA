package multithreading;
class myThreadRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
        System.out.println("I am thread not a threat");
    }

}
class myThreadRunnable2 implements Runnable {

    @Override
    public void run() {
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
        System.out.println("I am thread not a threat 2");
    }

}
public class RunnableThread {
    public static void main(String[] args) {
        myThreadRunnable bullet1 = new myThreadRunnable();
        Thread gun1 = new Thread(bullet1);
        myThreadRunnable2 mt1 = new myThreadRunnable2();
        Thread gun2 = new Thread(mt1);
        gun1.start();
        gun2.start();
    }
}
