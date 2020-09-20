package supermarket1;

import java.util.Scanner;

public class Aministrator3 {
	public  void aministrator3() {
		
		Scanner scan= new Scanner(System.in);
		Scanner  reader= new Scanner(System.in);
		String username=null,password=null;
		String username1="szz";
		String password1="cmy520";
		boolean flag = true;
		do {
		   System.out.println("请输入用户名：");
		   username=reader.next();
		   System.out.println("请输入密码：");
		   password = reader.next();
			   if(username.equals(username1)&& password.equals(password1)) {
			     System.out.println("登入成功!"); 
			     flag = false;
			   }else {
			     System.out.println("用户名或密码输入错误，请重新输入:");
			   }
			        
	}while(flag);
		
		
		int secondNum = 1;
	    
		do {
	    System.out.println("----------------");
	    System.out.println("欢迎进入前台管理员系统！");
		System.out.println("\t 1.个人所收账单查询");
	    System.out.println("\t 2.个人中心");
	    System.out.println("\t 0.退出前台管理员系统，返回主页");
	    System.out.println("请输入指令：");
	    secondNum =scan.nextInt();
	    switch (secondNum) {
	case 1:
		
		break;
	case 2:
	     GRZX ind=new GRZX();
	     ind.individual();  
	     break;
	
	case 0:
		System.out.println("返回上级菜单");
		break;
	default:
		System.out.println("请输入0-2之间的数");
	}
	} while (secondNum != 0);
		}
}

