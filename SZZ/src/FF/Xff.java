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
			System.out.println("\t y.登录购物系统");
			System.out.println("\t n.退出");
			System.out.println("--------------");
			System.out.println("请输入y/n：");
			input = scan.next();
			switch (input) {
			case "y":
				InfoManage(scan);

				break;
			case "n":
				firstflag = false;
				break;

			default:
				System.out.println("你输的不对");
			}
		} while (!input.equals("n"));
		System.out.println("结束了");
	}
	
	public static void InfoManage(Scanner scan) {
		int secondNum = 1;
		do {
			System.out.println("------------------");
			System.out.println("\t1.商品管理");
			System.out.println("\t0.返回上级菜单");
			System.out.println("请输入相关数字：");
			secondNum = scan.nextInt();
			switch (secondNum) {
			case 1:
				userManage(scan);
				break;
			case 0:
				System.out.println("马上返回上一级菜单");
				break;
			default:
				System.out.println("你输入的数字不对，请重试：");
			}
		} while (secondNum != 0);
	}
	
	public static void userManage(Scanner scan) {
		int thirdNum = 1;
		do {
			System.out.println("------------------");
			System.out.println("\t 1.增加用户");
			System.out.println("\t 2.删除用户");
			System.out.println("\t 3.修改用户");
			System.out.println("\t 4.查询商品");
			System.out.println("\t 0.返回上级菜单");
			System.out.println("请输入相关数字：");
			thirdNum = scan.nextInt();
			switch (thirdNum) {
			case 1:
				System.out.println("增加了客户");
				break;
			case 2:
				System.out.println("该用户不存在");
				break;
			case 3:
				System.out.println("用户已被修改");
				break;
			case 4:
				System.out.println("请填写要查询的商品");
				break;
			case 0:
				System.out.println("马上返回上一级菜单");
				break;
			default:
				System.out.println("你输入的不对，请重试：");
			}
		} while (thirdNum != 0);
	}
}
