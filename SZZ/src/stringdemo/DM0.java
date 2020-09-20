package stringdemo;

import java.util.Scanner;

public class DM0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		String username = null, password = null, repassword = null;

		do {
			System.out.println("请输入用户名：");
			username = reader.next();
			if (username.length() > 3) {
				System.out.println("请输入密码：");
				password = reader.next();
				if (password.length() >= 6) {
					System.out.println("请再次输入密码：");
					repassword = reader.next();
					if (repassword.equals(password)) {
						System.out.println("注册成功");
						break;
					} else {
						System.out.println("第一次和第二次输入的密码不同，注册失败");
					}
				} else {
					System.out.println("密码输入错误");
				}
			} else {
				System.out.println("用户名输入错误");
			}
		} while (true);
	}
}
