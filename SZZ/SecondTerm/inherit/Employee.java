package inherit;
/**
 *      员工类
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
		System.out.println("姓名：" + name);
		System.out.println("年龄：" + age);
		System.out.println("性别：" + sex);
		System.out.println("此为正常员工的月薪：" + monthly);
	}
}
