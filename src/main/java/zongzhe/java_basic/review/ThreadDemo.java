package zongzhe.java_basic.review;

public class ThreadDemo extends Thread {

    private Thread t;
    private String threadName;

    ThreadDemo(String name) {
        threadName = name;
    }

    public void run() {
        try {

            for (int i = 0; i < 5; i++) {
                System.out.println("Running " + threadName + "-" + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {

        }
    }

    public void start() {
        if (t == null) {
            t = new Thread(this, threadName);

        }
        t.start();
    }

    public static void main(String args[]) {
        ThreadDemo demo1 = new ThreadDemo("Thread1");
        demo1.start();
        ThreadDemo demo2 = new ThreadDemo("Thread2");
        demo2.start();
    }
}
