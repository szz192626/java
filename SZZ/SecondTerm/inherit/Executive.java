package inherit;
/**
 *    ������Ա��
 * 
 *
 */

public class Executive extends Employee {
	private String position; // ְλ
	private double administrative; // ��������

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
		System.out.println("������" + getName());
		System.out.println("���䣺" + getAge());
		System.out.println("�Ա�" + getSex());
		System.out.println("ְλ��"+position);
		System.out.println("����������"+administrative);
		System.out.println("������Ա����н��" + (getMonthly() + getAdministrative()));
	}
}
