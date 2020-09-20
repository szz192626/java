package threaddemo;

class MyThread1 extends Thread {
	public void run() {
		
		for (int i = 2; i < 100; i += 2) {
			System.out.println("1到100的所有偶数：" + i);
		}
	}
}

class MyThread2 extends Thread {
	public void run() {
		
		for (int i = 1; i < 100; i += 2) {
			System.out.println("1到100的所有奇数：" + i);
		}
	}
}

public class TestThread {
	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		MyThread2 myThread2 = new MyThread2();
		myThread1.start();
		myThread2.start();
	}
}
