package inherit;

public class TestCar {

	public static void main(String[] args) {
		Car car = new Car("������", 4, "����Դ");
		Bus bus = new Bus("������", 20, "����Դ", 3);
		lorry loy = new lorry("����", 2, "����Դ", 20);
		car.printCar();
		car.run("����");
		bus.printCar();
		bus.run("������");
		loy.printCar();
		loy.run("����");
	}

}
