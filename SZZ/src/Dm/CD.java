package Dm;
import java.util.Scanner;
public class CD {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("��ӭ���빺��ϵͳ");
		  System.out.println("�����������ʶ��");
		  System.out.println("\t  y:��¼ϵͳ");
		  System.out.println("\t n���˳�ϵͳ ");
		  System.out.println("�����������ʶ��");
			String str=scan.next();
		switch(str) {
		case"y":
			  System.out.println("��¼�ɹ�");
			  System.out.println("�ͻ���Ϣ����");
			  System.out.println("�������");
			  System.out.println("�������");
			  System.out.println("ע��");
			  
		break;
		case"n":
			System.out.println("�Ѿ��˳�ϵͳ");
		break;
		default:
		break;

	}

}
}