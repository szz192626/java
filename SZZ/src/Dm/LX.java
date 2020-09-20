package Dm;

import java.util.Scanner;

public class LX { 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入星期几：");
		System.out.println("\t  a:星期一和星期四");
		System.out.println("\t  b:星期二、星期三、星期五、星期六");
		System.out.println("\t  c:星期天");
		String str = scan.next();
		switch (str) {
		case "a":
			System.out.println("学习java");
			break;
		case "b":
			System.out.println("请选择内容：");
			System.out.println("\t  d:先学习英语");
			System.out.println("\t  e:先学习数学");
			String ste = scan.next();
			switch (ste) {
			case "d":
				System.out.println("复习三级");
				break;
			case "e":
				System.out.println("学习微积分");
				break;
			}
			
		case "c":
			System.out.println("休息");
			break;
		default:
			break;
		}
	}
}
