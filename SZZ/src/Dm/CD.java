package Dm;
import java.util.Scanner;
public class CD {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("欢迎进入购物系统");
		  System.out.println("请输入命令标识：");
		  System.out.println("\t  y:登录系统");
		  System.out.println("\t n：退出系统 ");
		  System.out.println("请输入命令标识：");
			String str=scan.next();
		switch(str) {
		case"y":
			  System.out.println("登录成功");
			  System.out.println("客户信息管理");
			  System.out.println("购物结算");
			  System.out.println("真情回馈");
			  System.out.println("注销");
			  
		break;
		case"n":
			System.out.println("已经退出系统");
		break;
		default:
		break;

	}

}
}