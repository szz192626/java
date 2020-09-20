package homework;
/**
 * 
 * 打印机抽象类
 *
 */
public abstract class Printer {
	private String name;

	public Printer() {

	}

	public Printer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void print();
}
