package zongzhe.java_basic.multithread;

/**
 * 本演示使用“厨师”-“服务员”来扮演生产者和消费者。
 * 出菜台表示数据的缓冲区域
 */
public class CommunicateDemo {
    public static void main(String[] args) {
        WorkBench wb = new WorkBench();
        Cook c1 = new Cook(wb);
        Cook c2 = new Cook(wb);
        Waiter w1 = new Waiter(wb);
        Waiter w2 = new Waiter(wb);
        Waiter w3 = new Waiter(wb);

        c1.start();
        c2.start();
        w1.start();
        w2.start();
        w3.start();
    }
}

class Cook extends Thread {
    private WorkBench wb;

    public Cook(WorkBench wb) { // wb显然是不能new一个的，否则厨师和服务员将在不同的平台工作。
        super();
        this.wb = wb;
    }

    @Override
    public void run() {
        while (true) {
            wb.put();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}

class Waiter extends Thread {
    private WorkBench wb;

    public Waiter(WorkBench wb) { // wb显然是不能new一个的，否则厨师和服务员将在不同的平台工作。
        super();
        this.wb = wb;
    }

    @Override
    public void run() {
        while (true) {
            wb.take();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

// 工作台：出菜的窗口平台
class WorkBench {
    private static final int MAX_VALUE = 10;
    private int num; // 工作台上菜的数量

    public synchronized void take() {
        while (num <= 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        num--;
        System.out.println("服务员取菜，剩余：" + num);
        this.notifyAll(); // 通知在wait的线程，从阻塞状态回到就绪状态，但是注意不一定会唤醒“厨师”线程
    }

    public synchronized void put() {
        while (num >= MAX_VALUE) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        num++;
        System.out.println("厨师做好了菜，剩余：" + num);
        this.notifyAll();
    }
}
