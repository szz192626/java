package inherit;
/**
 *      ������
 * 
 *
 */
public class Manager extends Executive {

	private double stock;// ��Ȩ
	private double generalCapital; // �ܹɱ�

	public double getStock() {
		return stock;
	}

	public void setStock(double stock) {
		this.stock = stock;
	}

	public double getGeneralCapital() {
		return generalCapital;
	}

	public void setGeneralCapital(double generalCapital) {
		this.generalCapital = generalCapital;
	}

	public Manager() {

	}

	public Manager(String name, int age, String sex, double monthly, String position, double administrative,
			double stock, double generalCapital) {
		super(name, age, sex, monthly, position, administrative);
		this.stock = stock;
		this.generalCapital = generalCapital;
	}

	public void printlncomebyMonth() {
		System.out.println("-------------------");
		System.out.println("������" + getName());
		System.out.println("���䣺" + getAge());
		System.out.println("�Ա�" + getSex());
		System.out.println("ְλ��" + getPosition());
		System.out.println("����������" + getAdministrative());
		System.out.println("�ܾ������н��" + stock * generalCapital + (getMonthly() + getAdministrative()));
	}

}
