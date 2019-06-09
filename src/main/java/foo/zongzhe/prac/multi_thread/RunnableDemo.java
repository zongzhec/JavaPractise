package foo.zongzhe.prac.multi_thread;

public class RunnableDemo implements Runnable {

	private Thread t;
	private String threadName;

	public RunnableDemo(String name) {
		threadName = name;
		System.out.println("Creating thread " + threadName);
	}

	@Override
	public void run() {
		System.out.println("Running thread " + threadName);
		try {
			for (int i = 0; i < 4; i++) {
				System.out.println("Sleeping for 1 sed in Thread " + threadName + ", " + i);
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread " + threadName + " is interrupted.");
		}
		System.out.println("Thread " + threadName + " existing.");
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
