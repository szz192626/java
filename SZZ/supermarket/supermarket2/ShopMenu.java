package supermarket2;

import java.util.*;

import supermarket1.Festivalscost;

public class ShopMenu {
	// 创建集合对象，用于存储商品信息数据
	static List<Goods> array2 = Repository.getArray(); // 商品集合
	static ArrayList<Goods> goodsArray = new ArrayList<Goods>(array2);
	static ArrayList<Bill> billArray = new ArrayList<Bill>(); // 账单集合
	static ArrayList<Vip> vipArray = new ArrayList<Vip>(); // 会员集合

	public static void main(String[] args) {
		manageMenu();
	}
	
	// 主菜单
	static void manageMenu() {

		// 用循环完成再次回到主界面
		while (true) {
			// 用输出语句完主界面的编写
			System.out.println("---------欢迎进入方舟购物系统---------");
			System.out.println("1. 商品库存管理系统");
			System.out.println("2. 收银员管理系统");
			System.out.println("3. 会员管理系统");
			System.out.println("4. 活动期间打折查看");
			System.out.println("5. 退出方舟购物系统");
			System.out.println("请输入指令：");
			// 用Scanner实现键盘录入数据
			Scanner input = new Scanner(System.in);
			String line = input.nextLine();
			// 用switch语句完成操作的选择
			switch (line) {

			case "1":
				GoodsManage.adminLogin(); // 管理员登录
				GoodsManage.goodsStockManage(goodsArray);
				break;

			case "2":
				MoneyManage.CashierLogin(); // 收银员登陆
				MoneyManage.moneyManage(goodsArray, billArray,vipArray);
				break;
			case "3":
				VipManage.adminLogin(); // 会员登陆
				VipManage.vipManage(vipArray);
				break;
			case"4":
				Festivalscost fe=new Festivalscost();
        		fe.festivalscost();
				break;
			case "5":
				System.out.println("谢谢使用，已退出系统");
				// break;
				System.exit(0);// JVM退出
			}
		}
	}


}
