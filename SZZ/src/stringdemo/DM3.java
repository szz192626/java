package stringdemo;

import java.util.Scanner;

public class DM3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="abcdEF";
		String str2="abcdEF";
		if(str1==str2){
			System.out.println("�����ַ�������ʹ��==�������Ȼ᷵��true");
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("���������룺");
		String password = scan.next();

		System.out.println(password);
		
		if("abcdEF".equals(password)) {
			System.out.println("����������ȷ");
		}
		else {
			System.out.println("�����������");
		}
		
		if("abcdEF".equalsIgnoreCase(password)) {
			System.out.println("�����ִ�Сд������������ȷ");
		}
		else {
			System.out.println("�����ִ�Сд�������������");
		}
	}
}
