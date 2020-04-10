package zongzhe.java_basic.multithread;

/**
 * 要求：创建两个线程，一个打印奇数，一个打印偶数，保证交替打印。
 */
public class OddEvenPrac {

    public static void main(String[] args) {
        NumPrinter np = new NumPrinter();
        OddPriter oddPrinter = new OddPriter(np);
        EvenPrinter evenPrinter = new EvenPrinter(np);

        oddPrinter.start();
        evenPrinter.start();
    }

}

class NumPrinter {
    private static int i = 0;
    private static Object lock = new Object();

    public NumPrinter() {
    }

    public static void count(String name) {
        synchronized (lock) {
            if ((name.equals("odd") && i % 2 == 0) || (name.equals("even") && i % 2 != 0)) {
                try {
                    lock.notify();
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("counting " + name + ": " + i);
                i++;
            }
        }
    }
}

class OddPriter extends Thread {
    private NumPrinter np;

    public OddPriter(NumPrinter np) {
        super();
        this.np = np;
    }

    @Override
    public void run() {
        System.out.println("odd starting");
        while (true) {
            NumPrinter.count("odd");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class EvenPrinter extends Thread {

    private NumPrinter np;

    public EvenPrinter(NumPrinter np) {
        super();
        this.np = np;
    }

    @Override
    public void run() {
        System.out.println("even starting");
        while (true) {
            NumPrinter.count("even");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
