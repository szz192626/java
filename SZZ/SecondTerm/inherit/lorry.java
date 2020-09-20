package inherit;

public class lorry extends Car {
	private double weight;

	public lorry() {

	}

	public lorry(String brand, int Number, String type, double weight) {
		super(brand, Number, type);
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void printCar() {
		super.printCar();
		System.out.println("载重量:" + weight);
	}

	public void run(String name) {
		System.out.println(name + "正在以100码的速度在高速公路上行驶");
	}

}
