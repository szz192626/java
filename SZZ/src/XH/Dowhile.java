package XH;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		boolean flag = true;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("���������֣�");

			int str = scan.nextInt();

			switch (str) {
			case 0:
				System.out.println("����");
				flag=false;
				break;
				
			case 1:
				System.out.println("����һMonday");
				break;
			case 2:
				System.out.println("���ڶ�Tuesday");
				break;
			case 3:
				System.out.println("������Wednesday");
				break;
			case 4:
				System.out.println("������Thursday");
				break;
			case 5:
				System.out.println("������Friday");
				break;
			case 6:
				System.out.println("������Saturday");
				break;
			case 7:
				System.out.println("������Sunday");
				break;
			default:
				System.out.println("����ò���");
				flag = true;
			}
		} while (flag == true);

	}

}
