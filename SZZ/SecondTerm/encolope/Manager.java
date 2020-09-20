package encolope;
/**
 *     总经理类
 * 
 *
 */
public class Manager extends Employee2{
	private double stock;// 股权
	private double generalCapital; // 总股本
	public Manager() {
		
	}
	public Manager(String name,int age,String sex,double monthly,double stock,double generalCapital) {

		super(name,age,sex,monthly);
		this.stock=stock;
		this.generalCapital=generalCapital;
		}
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
	public void print() {
		super.print();
	}
	public void printcomeFullYear() {
		System.out.println("总经理的年薪："+(stock*generalCapital+getMonthly())*12);
	}
 }
