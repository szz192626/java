package supermarket1;
import java.util.Scanner;
public class Customs {
	public  void customs() {
		Scanner scan= new Scanner(System.in);
		int thirdNum = 1;
		
		
		CustomsInformation inf = new CustomsInformation();
		do {
			System.out.println("------------------");
			System.out.println("\t 1.查询客户信息");
			System.out.println("\t 2.增加客户");
			System.out.println("\t 3.删除客户");
			System.out.println("\t 0.返回上级菜单");
			System.out.println("请输入相关数字：");
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
				System.out.println("返回上级菜单");
				break;
			default:
				System.out.println("请输入0-4之间的数");
			}
		} 
		while (thirdNum != 0);
		}

}
