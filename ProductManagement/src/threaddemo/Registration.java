package threaddemo;

class ExpertRegistration {
	private int count = 1;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void register() {
		while (true) {
			synchronized (this) {
				if (count > 40) {
					System.out.println("专家号已挂完啦！");
					break;
				} else {
					System.out.println(Thread.currentThread().getName() + "挂出的第 " + (count++) + " 个专家号");
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}

}

class RegisteredWindow extends Thread {
	private ExpertRegistration er;

	public RegisteredWindow(String name, ExpertRegistration er) {
		super(name);
		this.er = er;
	}

	@Override
	public void run() {
		super.run();
		er.register();
	}
}

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExpertRegistration er = new ExpertRegistration();

		RegisteredWindow rw1 = new RegisteredWindow("窗口1", er);
		RegisteredWindow rw2 = new RegisteredWindow("窗口2", er);
		RegisteredWindow rw3 = new RegisteredWindow("窗口3", er);

		rw1.start();
		rw2.start();
		rw3.start();
	}

}
