package stringdemo;

import java.util.Scanner;

public class DM6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		String username = null, password = null, repassword = null;
        boolean flag=true;
		
		do {
			System.out.println("�������û�����");
			username=reader.next();
			System.out.println("���������룺");
			password=reader.next();
			System.out.println("���ٴ��������룺");
			repassword=reader.next();
			flag=verify(username, password, repassword);
			
		}while(flag==false);
	}
	
	
	public static boolean verify(String name,String pass,String repass) {
		if(name.length()>=3) {
			if(pass.length()>=6) {
				if(pass.equals(repass)) {
					return true;
				}else {
					System.out.println("���벻��ͬ");
					return false;
				}
			}else {
				System.out.println("���벻�Ϸ�");
				return false;
			}
		}else {
			System.out.println("���ֲ��Ϸ�");
			return false;
		}
	}
	
	
	

}
