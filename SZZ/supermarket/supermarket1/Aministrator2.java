package supermarket1;

import java.util.Scanner;

public class Aministrator2 {

	public void aministrator() {

		Scanner scan = new Scanner(System.in);
		Scanner reader = new Scanner(System.in);
		String username = null, password = null;
		String username1 = "szz";
		String password1 = "246247";
		boolean flag = true;
		do {
			System.out.println("�������û�����");
			username = reader.next();
			System.out.println("���������룺");
			password = reader.next();
			if (username.equals(username1) && password.equals(password1)) {
				System.out.println("����ɹ�!");
				flag = false;
			} else {
				System.out.println("�û��������������������������:");
			}

		} while (flag);

		int secondNum = 1;

		do {
			System.out.println("----------------");
			System.out.println("���ѽ����̨����Աϵͳ�����ֹ�������");
			System.out.println("\t 1.��������");
			System.out.println("\t 2.��Ʒ����");
			System.out.println("\t 3.������");
			System.out.println("\t 4.�˻�����");
			System.out.println("\t 5.����ǰ̨����");
			System.out.println("\t 0.�˳�����Աϵͳ,������ҳ");
			System.out.println("������������֣�");
			secondNum = scan.nextInt();
			switch (secondNum) {
			case 1:
				JHGL pu = new JHGL();
				pu.purchase();

				break;
			case 2:
				SPGL me = new SPGL();
				me.merchandise();
				break;
			case 3:
				KCGL in = new KCGL();
				in.inventory();

				break;
			case 4:
				THGL re = new THGL();
				re.returnmanger();

				break;
			case 5:
				JSQTDD order = new JSQTDD();
				order.orders();
				break;
			case 0:
				System.out.println("���˳���̨����Աϵͳ");
				break;
			default:
				System.out.println("������0-5֮�����");
			}
		} while (secondNum != 0);
	}
}
