package homework;

/**
 * 彩色打印机
 * 
 *
 */

public class Colourprinter extends Printer {
	public Colourprinter() {

	}

	public Colourprinter(String name) {
		super(name);
	}

	public void print() {
		System.out.println(this.getName() + "正在使用中。。。");
		System.out.println(this.getName() + "可以打印出彩色纸");
		System.out.println("------------");
	}
}
