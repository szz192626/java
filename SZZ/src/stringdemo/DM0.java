package stringdemo;

import java.util.Scanner;

public class DM0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		String username = null, password = null, repassword = null;

		do {
			System.out.println("�������û�����");
			username = reader.next();
			if (username.length() > 3) {
				System.out.println("���������룺");
				password = reader.next();
				if (password.length() >= 6) {
					System.out.println("���ٴ��������룺");
					repassword = reader.next();
					if (repassword.equals(password)) {
						System.out.println("ע��ɹ�");
						break;
					} else {
						System.out.println("��һ�κ͵ڶ�����������벻ͬ��ע��ʧ��");
					}
				} else {
					System.out.println("�����������");
				}
			} else {
				System.out.println("�û����������");
			}
		} while (true);
	}
}
