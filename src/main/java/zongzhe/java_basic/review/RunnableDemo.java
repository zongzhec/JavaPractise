package zongzhe.java_basic.review;

public class RunnableDemo implements Runnable {

    private Thread t;
    private String threadName;

    RunnableDemo(String name) {
        threadName = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Running " + threadName + "-" + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {

        }
    }

    void start() {
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

    public static void main(String args[]) {
        RunnableDemo demo1 = new RunnableDemo("Thread1");
        demo1.start();
        RunnableDemo demo2 = new RunnableDemo("Thread2");
        demo2.start();
    }
}
