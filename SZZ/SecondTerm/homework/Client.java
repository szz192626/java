package homework;

/**
 * 客户类
 * 
 *
 */
public class Client {
	private String name;

	public Client() {

	}

	public Client(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void SubmitTasks(Printer printer) {
		System.out.println("客户姓名：" + getName());
		System.out.println(getName() + "提交打印任务：");
		if (printer instanceof Flatprinter) {
			Flatprinter flatprinter = (Flatprinter) printer;
			flatprinter.print();
		} else {
			System.out.println(this.getName() + "未成功打印黑白纸");
		}
		if (printer instanceof Colourprinter) {
			Colourprinter colourprinter = (Colourprinter) printer;
			colourprinter.print();
		} else {
			System.out.println(this.getName() + "未成功打印彩色纸");
		}
		if (printer instanceof DcolorPrinter) {
			DcolorPrinter dcolorPrinter = (DcolorPrinter) printer;
			dcolorPrinter.print();
		} else {
			System.out.println(this.getName() + "未成功打印三维彩色纸");
		}
	}

}
