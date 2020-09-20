package inherit;

public class TestEmployee {

	public static void main(String[] args) {
		Employee employee = new Employee("小明", 24, "男", 4500);
		Executive executive = new Executive("方方", 23, "女", 4500, "秘书", 2000);
		Manager manager = new Manager("龙腾", 25, "男", 4500, "总经理", 3000, 0.4, 50000);

		employee.printlncomebyMonth();
		executive.printlncomebyMonth();
		manager.printlncomebyMonth();

	}

}
