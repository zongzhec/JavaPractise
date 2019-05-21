package foo.zongzhe.prac.multi_thread;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class ThreadPrinterDemo implements Runnable {

	private String name;
	private Object prev;
	private Object self;

	private ThreadPrinterDemo(String name, Object prev, Object self) {
		this.name = name;
		this.prev = prev;
		this.self = self;
	}

	public static void main(String[] args) throws InterruptedException {
		Object a = new Object();
		Object b = new Object();
		Object c = new Object();

		ThreadPrinterDemo pa = new ThreadPrinterDemo("A", c, a);
		ThreadPrinterDemo pb = new ThreadPrinterDemo("B", a, b);
		ThreadPrinterDemo pc = new ThreadPrinterDemo("C", b, c);

		new Thread(pa).start();
		Thread.sleep(100); // Ensure the sequence of A, B and C
		new Thread(pb).start();
		Thread.sleep(100);
		new Thread(pc).start();
		Thread.sleep(100);
	}

	@Override
	public void run() {
		int count = 10;
		while (count > 0) {
			synchronized (prev) {
				synchronized (self) {
					System.out.println(name);
					count--;
					self.notify();
				}
				try {
					prev.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}

	}

}
