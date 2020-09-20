package enterpriseEntity;

public class EnterpriseSalary {
	private int id;
	private double commonsalary;
	private double extrasalary;
	private double positionsalary;
	private double stocksalary;

	public  EnterpriseSalary() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCommonsalary() {
		return commonsalary;
	}

	public void setCommonsalary(double commonsalary) {
		this.commonsalary = commonsalary;
	}

	public double getExtrasalary() {
		return extrasalary;
	}

	public void setExtrasalary(double extrasalary) {
		this.extrasalary = extrasalary;
	}

	public double getPositionsalary() {
		return positionsalary;
	}

	public void setPositionsalary(double positionsalary) {
		this.positionsalary = positionsalary;
	}

	public double getStocksalary() {
		return stocksalary;
	}

	public void setStocksalary(double stocksalary) {
		this.stocksalary = stocksalary;
	}

	@Override
	public String toString() {
		return "[ 工号："+ id +",基本工资：" + commonsalary + ", 加成工资：=" + extrasalary + ", 职位加成："
				+ positionsalary + ", 股份加成：" + stocksalary + "]";
	}




}
