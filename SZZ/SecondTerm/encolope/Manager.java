package encolope;
/**
 *     �ܾ�����
 * 
 *
 */
public class Manager extends Employee2{
	private double stock;// ��Ȩ
	private double generalCapital; // �ܹɱ�
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
		System.out.println("�ܾ������н��"+(stock*generalCapital+getMonthly())*12);
	}
 }
