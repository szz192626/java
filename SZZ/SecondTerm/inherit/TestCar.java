package inherit;

public class TestCar {

	public static void main(String[] args) {
		Car car = new Car("法拉利", 4, "新能源");
		Bus bus = new Bus("公交车", 20, "新能源", 3);
		lorry loy = new lorry("卡车", 2, "新能源", 20);
		car.printCar();
		car.run("汽车");
		bus.printCar();
		bus.run("公交车");
		loy.printCar();
		loy.run("卡车");
	}

}
