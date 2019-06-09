package foo.zongzhe.prac.multi_thread;

public class ThreadDemo extends Thread {

	private Thread t;
	private String threadName;

	public ThreadDemo(String name) {
		threadName = name;
		System.out.println("Creating thread " + threadName);
	}

	public void run() {
		System.out.println("Running thread " + threadName);
		try {
			for (int i = 0; i < 4; i++) {
				System.out.println("Sleeping thread " + threadName + ", " + i);
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Interrupted thread " + threadName);
		}
		System.out.println("Existing thread " + threadName);
	}

	public void start() {
		System.out.println("Starting thread " + threadName);
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
