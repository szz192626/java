package inherit;
/**
 *      Ա����
 * 
 *
 */
public class Employee {
	private String name;
	private int age;
	private String sex;
	private double monthly;

	public Employee() {

	}

	public Employee(String name, int age, String sex, double monthly) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.monthly = monthly;
	}

	public double getMonthly() {
		return monthly;
	}

	public void setMonthly(double monthly) {
		this.monthly = monthly;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void printlncomebyMonth() {
		System.out.println("-------------------");
		System.out.println("������" + name);
		System.out.println("���䣺" + age);
		System.out.println("�Ա�" + sex);
		System.out.println("��Ϊ����Ա������н��" + monthly);
	}
}
