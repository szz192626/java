package homework;

/**
 * �ڰ�ƽ���ӡ��
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
		System.out.println(this.getName() + "���ڱ�ʹ�á�����");
		System.out.println(this.getName() + "���Դ�ӡ���ڰ�ֽ");
		System.out.println("------------");
	}

}
