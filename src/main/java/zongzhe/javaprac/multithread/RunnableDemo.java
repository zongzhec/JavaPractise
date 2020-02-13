package zongzhe.javaprac.multithread;

public class RunnableDemo implements Runnable {

    private Thread t;
    private String threadName;

    RunnableDemo(String name) {
        this.threadName = name;
        System.out.println("Creating thread " + threadName);
    }

    public void run() {
        System.out.println("Running thread " + threadName);
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Running " + threadName + "-" + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("received interrupt exception");
        }
    }

    public void start() {
        t = new Thread(this, threadName);
        t.start();
    }

    public static void main(String args[]) {
        RunnableDemo rd1 = new RunnableDemo("Thread1");
        RunnableDemo rd2 = new RunnableDemo("Thread2");
        rd1.start();
        rd2.start();
    }

}
