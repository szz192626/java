package way;

public class Employee {
	private String name;
	private double salary;
	private static int count;

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
		count++;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("Alice", 3000);
		Employee e2 = new Employee("John", 6000);
		System.out.println(e1.name + " " + e1.count);
		System.out.println(e2.name + " " + e2.count);
	}

}
