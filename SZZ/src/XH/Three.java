package XH;

import java.util.Scanner;

public class Three {
	public  static void main(String[] args) {
//权限修饰符 //返回值类型
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
				int secondNum = 1;
				do {
					System.out.println("------------------");
					System.out.println("\t1.客户管理菜单");
					System.out.println("\t2.结账");
					System.out.println("\t3.真情回馈");
					System.out.println("\t0.返回上级菜单");
					System.out.println("请输入相关数字：");
					secondNum = scan.nextInt();
					switch (secondNum) {
					case 1:
						System.out.println("做了客户信息管理");
						break;
					case 0:
						System.out.println("马上返回上一级菜单");
						break;
					default:
						System.out.println("请输入0-3之间的数");
					}

				} while (secondNum != 0);

				break;
			case "n":
				firstflag = false;
				break;

			default:
				System.out.println("你输的不对");
			}
		} while (firstflag == true);
		System.out.println("结束了");
	}
 public  static void I() {
	 
	 
	 
 }
	
	
	
	
	
}
