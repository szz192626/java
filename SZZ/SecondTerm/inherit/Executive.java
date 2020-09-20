package inherit;
/**
 *    行政人员类
 * 
 *
 */

public class Executive extends Employee {
	private String position; // 职位
	private double administrative; // 行政补贴

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getAdministrative() {
		return administrative;
	}

	public void setAdministrative(double administrative) {
		this.administrative = administrative;
	}

	public Executive() {

	}

	public Executive(String name, int age, String sex, double monthly, String position, double administrative) {
		super(name, age, sex, monthly);
		this.position = position;
		this.administrative = administrative;

	}

	public void printlncomebyMonth() {
		System.out.println("-------------------");
		System.out.println("姓名：" + getName());
		System.out.println("年龄：" + getAge());
		System.out.println("性别：" + getSex());
		System.out.println("职位："+position);
		System.out.println("行政补贴："+administrative);
		System.out.println("行政人员的月薪：" + (getMonthly() + getAdministrative()));
	}
}
