package supermarket1;

import java.util.Scanner;

public class CF {
	public static void Enter(Scanner scan) {
		int secondNum = 1;
	do {
        System.out.println("----------------");
		System.out.println("\t1.�ͻ���Ϣ����");
	    System.out.println("\t2.�������");
	    System.out.println("\t3.�������");
	    System.out.println("\t4.��Ʒ����");
	    System.out.println("\t0.�����ϼ��˵�");
	    System.out.println("������������֣�");
	    secondNum = scan.nextInt();
	    switch (secondNum) {
	case 1:
		System.out.println("������Ϣ����");
		break;
	case 2:
	System.out.println("������Ϊ��xxx");
	break;
	case 3:
	System.out.println("���");
	break;
	case 4:
		userManage(scan);
	break;
	case 0:
		System.out.println("�����ϼ��˵�");
		break;
	default:
		System.out.println("������0-4֮�����");
	}
} while (secondNum != 0);
}
	public static void userManage(Scanner scan) {
		int thirdNum = 1;
		do {
			System.out.println("------------------");
			System.out.println("\t 1.������Ʒ");
			System.out.println("\t 2.ɾ����Ʒ");
			System.out.println("\t 3.�޸���Ʒ");
			System.out.println("\t 4.��ѯ��Ʒ");
			System.out.println("\t 0.�����ϼ��˵�");
			System.out.println("������������֣�");
			thirdNum = scan.nextInt();
			switch (thirdNum) {
			case 1:
				System.out.println("������Ʒ����");
				break;
			case 2:
				System.out.println("ɾ����Ʒ����");
				break;
			case 3:
				System.out.println("�޸���Ʒ����");
				break;
			case 4:
				System.out.println("��ѯ��Ʒ����");
				break;
			case 0:
				System.out.println("�����ϼ��˵�");
				break;
			default:
				System.out.println("������0-4֮�����");
			}
		} while (thirdNum != 0);
	}



}

