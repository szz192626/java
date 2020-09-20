package supermarket1;

import java.util.Scanner;

public class Registration {
	public  void regitration(){
		  boolean flag = true;
		  Scanner scan=new Scanner(System.in);
		  String name;String id;String gender;
		while(true) {
			System.out.println("-----------");
			System.out.print("\t 按0退出编辑");
			System.out.print("\t 按1进入编辑");
			Scanner in = new Scanner(System.in);
			int num = in.nextInt();
		if(num!=0) {
			
			System.out.println("   *姓名：    ");
			name=in.next();
			System.out.println("   *性别：    ");
			gender=in.next();
			System.out.println("   *手机号：    ");
			String str = scan.next();
			flag = false;
			}else {
		      if(num==0) {
				Cashier ca=new Cashier();
				ca.cashier();
			}
			}
		
		
		System.out.println("已注册成功！");
		
		}
	  
	  }

}
	
	
	
	

