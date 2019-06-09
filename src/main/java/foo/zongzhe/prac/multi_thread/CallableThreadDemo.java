package foo.zongzhe.prac.multi_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableThreadDemo implements Callable<Integer> {

	public static void main(String[] args) {
		CallableThreadDemo ctd = new CallableThreadDemo();
		FutureTask<Integer> ft = new FutureTask<>(ctd);
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "'s i value is " + i);
			if (i == 7) {
				new Thread(ft, "Thread with return value").start();
			}
		}

		try {
			System.out.println("Child thread return value is: " + ft.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Integer call() throws Exception {
		int i = 0;
		for (; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		return i;
	}

}
