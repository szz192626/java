package supermarket1;
import java.util.Scanner;
public class Customs {
	public  void customs() {
		Scanner scan= new Scanner(System.in);
		int thirdNum = 1;
		
		
		CustomsInformation inf = new CustomsInformation();
		do {
			System.out.println("------------------");
			System.out.println("\t 1.��ѯ�ͻ���Ϣ");
			System.out.println("\t 2.���ӿͻ�");
			System.out.println("\t 3.ɾ���ͻ�");
			System.out.println("\t 0.�����ϼ��˵�");
			System.out.println("������������֣�");
			thirdNum = scan.nextInt();
			switch (thirdNum) {
			case 1:
				
				break;
			case 2:
				Addcustoms add = new Addcustoms();
				add.addcustoms();
				break;
			case 3:
				Delcustoms del = new Delcustoms();
				del.delcustoms();
				break;
			case 0:
				System.out.println("�����ϼ��˵�");
				break;
			default:
				System.out.println("������0-4֮�����");
			}
		} 
		while (thirdNum != 0);
		}

}