package foo.zongzhe.prac.multi_thread;

public class RunnableDemoStart {

	public static void main(String[] args) {
		RunnableDemo r1 = new RunnableDemo("Thread-1");
		r1.start();

		RunnableDemo r2 = new RunnableDemo("Thread-2");
		r2.start();

	}

}
