package zongzhe.java_basic.multithread;

public class ThreadDemo {

    public static void main(String args[]) {
        MyThread thread1 = new MyThread("thread 1");
//       thread1.run(); // 不能手动调用run()，它不是程序员调用的，线程调度器会自动调用。
        thread1.start();

        MyThread thread2 = new MyThread("thread 2");
        thread2.start();

    }

}

class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    // 重写run方法
    @Override
    public void run() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(name + " - 偶数：" + i);
        }

    }
}
