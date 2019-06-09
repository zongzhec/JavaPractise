package foo.zongzhe.prac.multi_thread;

public class ThreadDemoStart {

	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo("Thread-1");
		t1.start();

		ThreadDemo t2 = new ThreadDemo("Thread-2");
		t2.start();

	}

}
