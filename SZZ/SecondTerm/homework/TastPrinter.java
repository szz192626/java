package homework;

public class TastPrinter {

	public static void main(String[] args) {
		System.out.println("三种打印机的功能：");
		System.out.println("-------------");
		Printer printer = new Flatprinter("黑白平面打印机");
		printer.print();
		Printer printer2 = new Colourprinter("彩色打印机");
		printer2.print();
		Printer printer3 = new DcolorPrinter("三维彩色打印机");
		printer3.print();
		System.out.println("-----------");
		Client client = new Client("方方");
		client.SubmitTasks(printer);
        
	}

}
