package inherit;

public class Car {

	private String brand;
	private int Number;
	private String type;

	public Car() {

	}

	public Car(String brand, int Number, String type) {
		this.brand = brand;
		this.Number = Number;
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getNumber() {
		return Number;
	}

	public void setNumber(int number) {
		Number = number;
	}

	public void printCar() {
		System.out.println("------------");
		System.out.println("品牌:" + brand);
		System.out.println("乘坐人数:" + Number);
		System.out.println("能源类型：" + type);
	}

	public void run(String name) {
		System.out.println(name + "正在运行中。。。");
	}
}
