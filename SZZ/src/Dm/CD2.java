package Dm;
import java.util.Scanner;
public class CD2 {
public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
		System.out.println("��ӭ���빺��ϵͳ");
		System.out.println("�����������ʶ��");
		System.out.println("\t y:��¼ϵͳ");
		System.out.println("\t n���˳�ϵͳ ");
		System.out.println("�����������ʶ��");
		String str = scan.next();
		switch (str) {
		case "y":
			System.out.println("��¼�ɹ�");
			System.out.println("�����������ʶ��");
			System.out.println("\t  a:�ͻ���Ϣ����");
			System.out.println("�������");
			System.out.println("\t  b:�������");
			System.out.println("ע��");
			String ste = scan.next();
			switch (ste) {
			case "a":
				System.out.println("��ʾ���пͻ���Ϣ");
				System.out.println("��ӿͻ���Ϣ");
				System.out.println("�޸Ŀͻ���Ϣ");
				System.out.println("��ѯ�ͻ���Ϣ");
				break;
			case "b":
				System.out.println("���˴����");
				System.out.println("���˳齱");
				System.out.println("�����ʺ�");
				break;
			}
			case "n":
				System.out.println("�Ѿ��˳�ϵͳ");
				break;
			default:
				break;

		}

	}
}