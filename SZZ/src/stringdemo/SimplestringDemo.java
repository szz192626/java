package stringdemo;

import java.util.Scanner;

public class SimplestringDemo {

	public static void main(String[] args) {
        System.out.println("�ַ�������");
		String str="�ַ���������ֵ";
				System.out.println(str);
		 str=new String("����new�������ַ���");
		   System.out.println(str);
		   
		    int length=str.length();
		    System.out.println("�����ַ����ĳ���Ϊ��"+length);
		Scanner scan=new Scanner(System.in);
		String password=null;
		System.out.println("���������룺");
		 password = scan.next();
		do {
		if(password.length()<6) {
			System.out.println("��������벻��С��6,����������:");
			password = scan.next();
		
		}
		else {
			break;
		}
		
		
		
		}while(true);

	}

}
