package supermarket1;

import java.util.Scanner;

public class Registration {
	public  void regitration(){
		  boolean flag = true;
		  Scanner scan=new Scanner(System.in);
		  String name;String id;String gender;
		while(true) {
			System.out.println("-----------");
			System.out.print("\t ��0�˳��༭");
			System.out.print("\t ��1����༭");
			Scanner in = new Scanner(System.in);
			int num = in.nextInt();
		if(num!=0) {
			
			System.out.println("   *������    ");
			name=in.next();
			System.out.println("   *�Ա�    ");
			gender=in.next();
			System.out.println("   *�ֻ��ţ�    ");
			String str = scan.next();
			flag = false;
			}else {
		      if(num==0) {
				Cashier ca=new Cashier();
				ca.cashier();
			}
			}
		
		
		System.out.println("��ע��ɹ���");
		
		}
	  
	  }

}
	
	
	
	

