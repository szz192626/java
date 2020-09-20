package homework;

/**
 * 黑白平面打印机
 * 
 *
 */
public class Flatprinter extends Printer {
	public Flatprinter() {

	}

	public Flatprinter(String name) {
		super(name);
	}

	public void print() {
		System.out.println(this.getName() + "正在被使用。。。");
		System.out.println(this.getName() + "可以打印出黑白纸");
		System.out.println("------------");
	}

}
