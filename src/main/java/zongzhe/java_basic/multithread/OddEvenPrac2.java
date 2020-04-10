package zongzhe.java_basic.multithread;

/**
 * 要求：创建两个线程，一个打印奇数，一个打印偶数，保证交替打印。
 */
public class OddEvenPrac2 {

    public static void main(String[] args) {
        NumPrinter2 np = new NumPrinter2();
        OddPriter2 oddPrinter = new OddPriter2(np);
        EvenPrinter2 evenPrinter = new EvenPrinter2(np);

        oddPrinter.start();
        evenPrinter.start();
    }

}


class NumPrinter2 {
    private static int num;
    private static Object lock = new Object();

    public static void odd() {
        synchronized (lock) {
            num++;
            System.out.println(Thread.currentThread().getName() + ": " + num);
            try {
                lock.notify();
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void even() {
        synchronized (lock) {
            num++;
            System.out.println(Thread.currentThread().getName() + ": " + num);
            try {
                lock.notify();
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class OddPriter2 extends Thread {
    private NumPrinter2 np;

    public OddPriter2(NumPrinter2 np) {
        super();
        this.np = np;
    }

    @Override
    public void run() {
        System.out.println("odd starting");
        while (true) {
            NumPrinter2.odd();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class EvenPrinter2 extends Thread {

    private NumPrinter2 np;

    public EvenPrinter2(NumPrinter2 np) {
        super();
        this.np = np;
    }

    @Override
    public void run() {
        System.out.println("even starting");
        while (true) {
            NumPrinter2.even();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
