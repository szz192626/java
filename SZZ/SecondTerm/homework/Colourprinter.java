package homework;

/**
 * ��ɫ��ӡ��
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
		System.out.println(this.getName() + "����ʹ���С�����");
		System.out.println(this.getName() + "���Դ�ӡ����ɫֽ");
		System.out.println("------------");
	}
}
