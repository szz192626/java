package Dm;
import java.util.Scanner;
public class CD2 {
public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);
		System.out.println("欢迎进入购物系统");
		System.out.println("请输入命令标识：");
		System.out.println("\t y:登录系统");
		System.out.println("\t n：退出系统 ");
		System.out.println("请输入命令标识：");
		String str = scan.next();
		switch (str) {
		case "y":
			System.out.println("登录成功");
			System.out.println("请输入命令标识：");
			System.out.println("\t  a:客户信息管理");
			System.out.println("购物结算");
			System.out.println("\t  b:真情回馈");
			System.out.println("注销");
			String ste = scan.next();
			switch (ste) {
			case "a":
				System.out.println("显示所有客户信息");
				System.out.println("添加客户信息");
				System.out.println("修改客户信息");
				System.out.println("查询客户信息");
				break;
			case "b":
				System.out.println("幸运大放送");
				System.out.println("幸运抽奖");
				System.out.println("生日问候");
				break;
			}
			case "n":
				System.out.println("已经退出系统");
				break;
			default:
				break;

		}

	}
}