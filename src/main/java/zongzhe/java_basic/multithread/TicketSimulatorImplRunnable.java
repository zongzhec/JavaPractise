package zongzhe.java_basic.multithread;

import java.util.ArrayList;

/**
 * 模拟两个窗口卖票
 */
public class TicketSimulatorImplRunnable {
    public static void main(String[] args) {
        TicketWindowRunnable tw = new TicketWindowRunnable();

        Thread tw1 = new Thread(tw, "win1");
        Thread tw2 = new Thread(tw, "win2");
        tw1.start();
        tw2.start();

    }
}

class TicketWindowRunnable implements Runnable {
    private String winName;
    private TicketService ts = new TicketService();

    @Override
    public void run() {
        while (true) {
            synchronized (ts) {
                if (ts.hasTicket()) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " is selling " + ts.sale());
                } else {
                    break;
                }
            }
        }

    }
}

