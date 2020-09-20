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
			System.out.println("请输入用户名：");
			username = reader.next();
			System.out.println("请输入密码：");
			password = reader.next();
			if (username.equals(username1) && password.equals(password1)) {
				System.out.println("登入成功!");
				flag = false;
			} else {
				System.out.println("用户名或密码输入错误，请重新输入:");
			}

		} while (flag);

		int secondNum = 1;

		do {
			System.out.println("----------------");
			System.out.println("您已进入后台管理员系统，请防止可疑人物！");
			System.out.println("\t 1.进货管理");
			System.out.println("\t 2.商品管理");
			System.out.println("\t 3.库存管理");
			System.out.println("\t 4.退货管理");
			System.out.println("\t 5.接受前台订单");
			System.out.println("\t 0.退出管理员系统,返回主页");
			System.out.println("请输入相关数字：");
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
				System.out.println("已退出后台管理员系统");
				break;
			default:
				System.out.println("请输入0-5之间的数");
			}
		} while (secondNum != 0);
	}
}
