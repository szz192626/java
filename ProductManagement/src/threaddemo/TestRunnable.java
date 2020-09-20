package threaddemo;

class SelfRun implements Runnable {

	@Override
	public void run() {

		for (int i = 2; i <= 100; i += 2) {

			System.out.println(Thread.currentThread().getName() + "1到100的所有偶数" + i);

		}
	}
}

public class TestRunnable {

	public static void main(String[] args) {
		SelfRun sr1 = new SelfRun();
		Thread th1 = new Thread(sr1, "子线程:");
		th1.start();

		for (int i = 1; i <= 100; i += 2) {
			System.out.println("1到100的所有奇数" + i);

		}

	}

}
