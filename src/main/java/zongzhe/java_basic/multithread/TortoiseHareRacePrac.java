package zongzhe.java_basic.multithread;

/**
 * 多线程的案例：龟兔赛跑
 * 赛跑长度为30米
 * 兔子速度每秒10米，每跑完10米休眠10秒
 * 乌龟速度美妙1米，每跑完10米休眠1秒
 * 要求等兔子和乌龟的线程都结束，主线程（裁判）才能公布最后结果
 */
public class TortoiseHareRacePrac {

    static Racer hare;
    static Racer tortoise;

    public static void main(String[] args) {
        prepare();
        race();

    }

    public static void prepare() {
        hare = new Racer("兔子", 100, 10000);
        tortoise = new Racer("乌龟", 1000, 1000);
    }

    public static void race() {
        hare.start();
        tortoise.start();

        try {
            hare.join();
            tortoise.join(); // 只是阻塞了main
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (hare.getRunTime() < tortoise.getRunTime()) {
            System.out.println(hare.getName() + "赢了");
        } else if (hare.getRunTime() > tortoise.getRunTime()) {
            System.out.println(tortoise.getName() + "赢了");
        } else {
            System.out.println("平手！");
        }
    }
}

class Racer extends Thread {
    private long timePerMeter; // 跑一米的时间
    private long restTime; // 跑10米的休息时间
    private long runTime = -1; // 跑完全程的时间

    public Racer(String name, long timePerMeter, long restTime) {
        super(name);
        this.timePerMeter = timePerMeter;
        this.restTime = restTime;
    }

    public long getRunTime() {
        return runTime;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= 30; i++) {
            try {
                System.out.println(getName() + "已经跑完 " + i + "米");
                Thread.sleep(timePerMeter);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                // 每跑完10米休眠时间
                if (i == 10 || i == 20) {
                    System.out.println(getName() + "大休中");
                    Thread.sleep(restTime);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        runTime = endTime - startTime;
        System.out.println(getName() + "到达终点，用时: " + runTime);
    }

}

class Hare extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 30; i += 10) {
            try {
                // 兔子跑一米需要0.1秒
                System.out.println("兔子已经跑完 " + i + "米");
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                // 兔子每跑完10米休眠10秒
                if (i == 10 || i == 20) {
                    System.out.println("兔子大休中");
                    Thread.sleep(10000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("兔子到达终点");
    }
}

class Tortoise extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 30; i += 1) {
            try {
                // 乌龟跑一米需要1秒
                System.out.println("乌龟已经跑完 " + i + "米");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                // 乌龟每跑完10米休眠1秒
                if (i == 10 || i == 20) {
                    System.out.println("乌龟大休中");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("乌龟到达终点");
    }
}
