package stringdemo;

import java.util.Scanner;

public class Stringwu {

	public static void main(java.lang.String[] args) {
		String str1="abcdEF";
		String str2="abcdEF";
		if(str1.equals(str2)) {
			System.out.println("两个字符串常量使用==，");
		}
		Scanner scan=new Scanner(System.in);
		  System.out.println("请输入密码：");
	    String    password =scan.next();
	  
		System.out.println(password);
		
		
		
		
		
	}

}
