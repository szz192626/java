package MXDX;

import java.util.Scanner;

public class Administrator {
      String   username;
      String   password;
	 public void  mange() {
		 System.out.println("-----");
		 System.out.println("�û�����"+username);
		 System.out.println("���룺"+password);
		 
	 }
      public void modifypassword() {
    	  Scanner scan=new Scanner(System.in);
  		System.out.println("�������û�����");
  		String name=scan.next();
  		System.out.println("���������룺");
  		String  pass=scan.next();
  		if(name.equals(username)
  				&&pass.equals(password)) {
  			
  			System.out.println("�����������룺");
  			String repassword=scan.next();
  			password=repassword;
  			System.out.println("�����޸ĳɹ�");
  		}else {
  			System.out.println("����û���޸ĳɹ�");
  		}
  			
  		

      }
      
      
	
}
