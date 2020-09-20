package inherit;

public class Bus extends Car {
	private int few;

	public Bus() {

	}

	public Bus(String brand, int Number, String type, int few) {
		super(brand, Number, type);
		this.few = few;
	}

	public int getFew() {
		return few;
	}

	public void setFew(int few) {
		this.few = few;
	}

	public void printCar() {
		super.printCar();
		System.out.println("几路:" + few);

	}

	public void run(String name) {
		System.out.println(name + "正在以60码速度行驶");
	}

}
