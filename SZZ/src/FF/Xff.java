package FF;

import java.util.Scanner;

public class Xff {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String input = "y";
		boolean firstflag = true;
		do {
			System.out.println("--------------");
			System.out.println("\t y.��¼����ϵͳ");
			System.out.println("\t n.�˳�");
			System.out.println("--------------");
			System.out.println("������y/n��");
			input = scan.next();
			switch (input) {
			case "y":
				InfoManage(scan);

				break;
			case "n":
				firstflag = false;
				break;

			default:
				System.out.println("����Ĳ���");
			}
		} while (!input.equals("n"));
		System.out.println("������");
	}
	
	public static void InfoManage(Scanner scan) {
		int secondNum = 1;
		do {
			System.out.println("------------------");
			System.out.println("\t1.��Ʒ����");
			System.out.println("\t0.�����ϼ��˵�");
			System.out.println("������������֣�");
			secondNum = scan.nextInt();
			switch (secondNum) {
			case 1:
				userManage(scan);
				break;
			case 0:
				System.out.println("���Ϸ�����һ���˵�");
				break;
			default:
				System.out.println("����������ֲ��ԣ������ԣ�");
			}
		} while (secondNum != 0);
	}
	
	public static void userManage(Scanner scan) {
		int thirdNum = 1;
		do {
			System.out.println("------------------");
			System.out.println("\t 1.�����û�");
			System.out.println("\t 2.ɾ���û�");
			System.out.println("\t 3.�޸��û�");
			System.out.println("\t 4.��ѯ��Ʒ");
			System.out.println("\t 0.�����ϼ��˵�");
			System.out.println("������������֣�");
			thirdNum = scan.nextInt();
			switch (thirdNum) {
			case 1:
				System.out.println("�����˿ͻ�");
				break;
			case 2:
				System.out.println("���û�������");
				break;
			case 3:
				System.out.println("�û��ѱ��޸�");
				break;
			case 4:
				System.out.println("����дҪ��ѯ����Ʒ");
				break;
			case 0:
				System.out.println("���Ϸ�����һ���˵�");
				break;
			default:
				System.out.println("������Ĳ��ԣ������ԣ�");
			}
		} while (thirdNum != 0);
	}
}