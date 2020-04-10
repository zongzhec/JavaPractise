package zongzhe.java_basic.multithread;

/**
 * 练习：实现一个银行账户，由丈夫和妻子管理。
 * 丈夫负责存钱，妻子负责取钱。
 */
public class BankAccountPrac {

    public static void main(String[] args) {
        Husband husband = new Husband();
        Wife wife = new Wife();

        husband.start();
        wife.start();
    }
}

class BankAccount {
    private static int balance = 0;
    private static Object accounLock = new Object();

    public static void saveMoney(int amount) {
        synchronized (accounLock) {
            balance += amount;
            System.out.println("存入 " + amount + ", 余额: " + balance);
            accounLock.notify();
        }
    }

    public static void withdrawMoney(int amount) {
        synchronized (accounLock) {
            if (amount > balance) {
                System.out.println("准备取" + amount + "，但是余额只有" + balance + "，叫你丈夫打钱。");
                try {
                    accounLock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                balance -= amount;
                System.out.println("取出 " + amount + ", 余额: " + balance);
            }

        }
    }
}

class Husband extends Thread {

    @Override
    public void run() {
        while (true) {
            int saveAmount = (int) (Math.random() * 50);
            BankAccount.saveMoney(saveAmount);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Wife extends Thread {

    @Override
    public void run() {
        while (true) {
            int withdrawAmount = (int) (Math.random() * 100);
            BankAccount.withdrawMoney(withdrawAmount);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
