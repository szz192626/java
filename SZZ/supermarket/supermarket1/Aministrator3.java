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
		   System.out.println("�������û�����");
		   username=reader.next();
		   System.out.println("���������룺");
		   password = reader.next();
			   if(username.equals(username1)&& password.equals(password1)) {
			     System.out.println("����ɹ�!"); 
			     flag = false;
			   }else {
			     System.out.println("�û��������������������������:");
			   }
			        
	}while(flag);
		
		
		int secondNum = 1;
	    
		do {
	    System.out.println("----------------");
	    System.out.println("��ӭ����ǰ̨����Աϵͳ��");
		System.out.println("\t 1.���������˵���ѯ");
	    System.out.println("\t 2.��������");
	    System.out.println("\t 0.�˳�ǰ̨����Աϵͳ��������ҳ");
	    System.out.println("������ָ�");
	    secondNum =scan.nextInt();
	    switch (secondNum) {
	case 1:
		
		break;
	case 2:
	     GRZX ind=new GRZX();
	     ind.individual();  
	     break;
	
	case 0:
		System.out.println("�����ϼ��˵�");
		break;
	default:
		System.out.println("������0-2֮�����");
	}
	} while (secondNum != 0);
		}
}

