package stringdemo;

import java.util.Scanner;

public class DM1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("�ַ�������");
		String str = "�ַ���������ֵ";
		System.out.println(str);

		str = new String("����new�������ַ���");
		System.out.println(str);

		int length = str.length();
		System.out.println("�����ַ����ĳ���Ϊ" + length);

		Scanner scan = new Scanner(System.in);
		String password = null;
		do {
			System.out.println("���������룺");

			password = scan.next();

			if (password.length() < 6) {
				System.out.println("��������볤�Ȳ���С��6,����������");
			}
			else {
				break;
			}
		} while (true);

	}
}
