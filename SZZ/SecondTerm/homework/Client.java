package homework;

/**
 * �ͻ���
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
		System.out.println("�ͻ�������" + getName());
		System.out.println(getName() + "�ύ��ӡ����");
		if (printer instanceof Flatprinter) {
			Flatprinter flatprinter = (Flatprinter) printer;
			flatprinter.print();
		} else {
			System.out.println(this.getName() + "δ�ɹ���ӡ�ڰ�ֽ");
		}
		if (printer instanceof Colourprinter) {
			Colourprinter colourprinter = (Colourprinter) printer;
			colourprinter.print();
		} else {
			System.out.println(this.getName() + "δ�ɹ���ӡ��ɫֽ");
		}
		if (printer instanceof DcolorPrinter) {
			DcolorPrinter dcolorPrinter = (DcolorPrinter) printer;
			dcolorPrinter.print();
		} else {
			System.out.println(this.getName() + "δ�ɹ���ӡ��ά��ɫֽ");
		}
	}

}
