package inherit;
/**
 *      经理类
 * 
 *
 */
public class Manager extends Executive {

	private double stock;// 股权
	private double generalCapital; // 总股本

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
		System.out.println("姓名：" + getName());
		System.out.println("年龄：" + getAge());
		System.out.println("性别：" + getSex());
		System.out.println("职位：" + getPosition());
		System.out.println("行政补贴：" + getAdministrative());
		System.out.println("总经理的月薪：" + stock * generalCapital + (getMonthly() + getAdministrative()));
	}

}
