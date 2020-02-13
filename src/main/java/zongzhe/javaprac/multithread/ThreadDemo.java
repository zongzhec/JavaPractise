package zongzhe.javaprac.multithread;

public class ThreadDemo extends Thread {

    private Thread t;
    private String threadName;

    ThreadDemo(String name) {
        this.threadName = name;
        System.out.println("Crating thread: " + threadName);
    }

    public void run() {
        System.out.println("Running thread: " + threadName);
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Running thread for " + threadName + "-" + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + "  is interruptted");
        } finally {
//            Thread.
        }

    }

    public void start() {
        System.out.println("Starting " + threadName);
        t = new Thread(this, threadName);
        t.start();
    }

    public static void main(String args[]) {
        ThreadDemo td1 = new ThreadDemo("Thread1");
        ThreadDemo td2 = new ThreadDemo("Thread2");
        td2.start();
        td1.start();
    }


}
