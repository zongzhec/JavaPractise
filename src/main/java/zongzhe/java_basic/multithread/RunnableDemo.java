package zongzhe.java_basic.multithread;

public class RunnableDemo {

    public static void main(String args[]) {
        MyRunnable runnable = new MyRunnable("runnable 1");
//        runnable.run(); 错误，这样调用不是多线程
//        runnable.start(); 错误，Runnable中没有start方法

        Thread thread1 = new Thread(runnable); // 因为只有Thread类中才有start方法，所以必须通过Thread类的对象才能启动线程
        thread1.start();
        Thread thread2 = new Thread(runnable);
        thread2.start();
    }

}

class MyRunnable implements Runnable {

    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 2; i < 10; i += 2) {
            System.out.println(name + " - 偶数： " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

