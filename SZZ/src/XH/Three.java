package XH;

import java.util.Scanner;

public class Three {
	public  static void main(String[] args) {
//Ȩ�����η� //����ֵ����
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
				int secondNum = 1;
				do {
					System.out.println("------------------");
					System.out.println("\t1.�ͻ������˵�");
					System.out.println("\t2.����");
					System.out.println("\t3.�������");
					System.out.println("\t0.�����ϼ��˵�");
					System.out.println("������������֣�");
					secondNum = scan.nextInt();
					switch (secondNum) {
					case 1:
						System.out.println("���˿ͻ���Ϣ����");
						break;
					case 0:
						System.out.println("���Ϸ�����һ���˵�");
						break;
					default:
						System.out.println("������0-3֮�����");
					}

				} while (secondNum != 0);

				break;
			case "n":
				firstflag = false;
				break;

			default:
				System.out.println("����Ĳ���");
			}
		} while (firstflag == true);
		System.out.println("������");
	}
 public  static void I() {
	 
	 
	 
 }
	
	
	
	
	
}