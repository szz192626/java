package homework;

public class TastPrinter {

	public static void main(String[] args) {
		System.out.println("���ִ�ӡ���Ĺ��ܣ�");
		System.out.println("-------------");
		Printer printer = new Flatprinter("�ڰ�ƽ���ӡ��");
		printer.print();
		Printer printer2 = new Colourprinter("��ɫ��ӡ��");
		printer2.print();
		Printer printer3 = new DcolorPrinter("��ά��ɫ��ӡ��");
		printer3.print();
		System.out.println("-----------");
		Client client = new Client("����");
		client.SubmitTasks(printer);
        
	}

}
