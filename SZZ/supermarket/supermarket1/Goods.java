package supermarket1;
import java.util.Scanner;
public class Goods {
	public  void goods() {
		Scanner scan= new Scanner(System.in);
		int fourthNum = 1;
		do {
			System.out.println("------------------");
			System.out.println("\t 1.ʳƷ��");
			System.out.println("\t 2.�߹���");
			System.out.println("\t 3.������");
			System.out.println("\t 4.������Ʒ��");
			System.out.println("\t 5.������");
			System.out.println("\t 6.����");
			System.out.println("\t 0.�����ϼ��˵�");
			System.out.println("������������֣�");
			fourthNum = scan.nextInt();
			switch (fourthNum) {
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
		} 
		while (fourthNum != 0);
		}

}
