package inherit;

public class TestEmployee {

	public static void main(String[] args) {
		Employee employee = new Employee("С��", 24, "��", 4500);
		Executive executive = new Executive("����", 23, "Ů", 4500, "����", 2000);
		Manager manager = new Manager("����", 25, "��", 4500, "�ܾ���", 3000, 0.4, 50000);

		employee.printlncomebyMonth();
		executive.printlncomebyMonth();
		manager.printlncomebyMonth();

	}

}
