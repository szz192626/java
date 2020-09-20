package stringdemo;

import java.util.Scanner;

public class SimplestringDemo {

	public static void main(String[] args) {
        System.out.println("字符串常量");
		String str="字符串变量的值";
				System.out.println(str);
		 str=new String("这是new出来的字符串");
		   System.out.println(str);
		   
		    int length=str.length();
		    System.out.println("如上字符串的长度为："+length);
		Scanner scan=new Scanner(System.in);
		String password=null;
		System.out.println("请输入密码：");
		 password = scan.next();
		do {
		if(password.length()<6) {
			System.out.println("输入的密码不能小于6,请重新输入:");
			password = scan.next();
		
		}
		else {
			break;
		}
		
		
		
		}while(true);

	}

}
