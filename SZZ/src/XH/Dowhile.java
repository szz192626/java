package XH;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		boolean flag = true;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("请输入数字：");

			int str = scan.nextInt();

			switch (str) {
			case 0:
				System.out.println("跳出");
				flag=false;
				break;
				
			case 1:
				System.out.println("星期一Monday");
				break;
			case 2:
				System.out.println("星期二Tuesday");
				break;
			case 3:
				System.out.println("星期三Wednesday");
				break;
			case 4:
				System.out.println("星期四Thursday");
				break;
			case 5:
				System.out.println("星期五Friday");
				break;
			case 6:
				System.out.println("星期六Saturday");
				break;
			case 7:
				System.out.println("星期天Sunday");
				break;
			default:
				System.out.println("你输得不对");
				flag = true;
			}
		} while (flag == true);

	}

}
