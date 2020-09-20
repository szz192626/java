package stringdemo;

import java.util.Scanner;

public class DM3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="abcdEF";
		String str2="abcdEF";
		if(str1==str2){
			System.out.println("两个字符串常量使用==，如果相等会返回true");
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入密码：");
		String password = scan.next();

		System.out.println(password);
		
		if("abcdEF".equals(password)) {
			System.out.println("输入密码正确");
		}
		else {
			System.out.println("密码输入错误");
		}
		
		if("abcdEF".equalsIgnoreCase(password)) {
			System.out.println("不区分大小写后，输入密码正确");
		}
		else {
			System.out.println("不区分大小写后，密码输入错误");
		}
	}
}
