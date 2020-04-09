package zongzhe.java_basic.multithread;

import java.util.ArrayList;

/**
 * 模拟两个窗口卖票
 */
public class TicketSimulatorExtThread {
    public static void main(String[] args) {
        TicketWindow tw1 = new TicketWindow("win1");
        TicketWindow tw2 = new TicketWindow("win2");
        tw1.start();
        tw2.start();

    }
}

class TicketWindow extends Thread {
    private String winName;
    private static TicketService ts = new TicketService();

    public TicketWindow(String winName) {
        super(winName);
        this.winName = winName;
    }

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
                    System.out.println(getName() + " is selling " + ts.sale());
                } else {
                    break;
                }
            }
        }

    }
}

class TicketService {
    private ArrayList<String> all;

    public TicketService() {
        all = new ArrayList<>();
        all.add("01车01A");
        all.add("01车01B");
        all.add("01车01C");
        all.add("01车01D");
        all.add("01车01E");
        all.add("01车01F");

        all.add("01车02A");
        all.add("01车02B");
    }

    // 查询是否还有票
    public boolean hasTicket() {
        return all.size() > 0;
    }

    // 卖票
    public String sale() {
        return all.remove(0);
    }
}
