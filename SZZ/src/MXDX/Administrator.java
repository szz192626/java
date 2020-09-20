package MXDX;

import java.util.Scanner;

public class Administrator {
      String   username;
      String   password;
	 public void  mange() {
		 System.out.println("-----");
		 System.out.println("用户名："+username);
		 System.out.println("密码："+password);
		 
	 }
      public void modifypassword() {
    	  Scanner scan=new Scanner(System.in);
  		System.out.println("请输入用户名：");
  		String name=scan.next();
  		System.out.println("请输入密码：");
  		String  pass=scan.next();
  		if(name.equals(username)
  				&&pass.equals(password)) {
  			
  			System.out.println("请输入新密码：");
  			String repassword=scan.next();
  			password=repassword;
  			System.out.println("密码修改成功");
  		}else {
  			System.out.println("密码没有修改成功");
  		}
  			
  		

      }
      
      
	
}
