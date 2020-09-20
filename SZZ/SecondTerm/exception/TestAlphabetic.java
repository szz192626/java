package exception;

import java.util.Scanner;

public class TestAlphabetic {

	public static void main(String[] args) {
		Scanner  scan=new Scanner(System.in);
		System.out.println("请输入数字：");
		try {
		int charAt=scan.nextInt();
		String a="cmydbz";
		for(int i=0;i<=a.length();i++) {
			System.out.println(a.charAt(i));
		}
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("检测到字符串越界异常，已被捕获！");
		}catch(Exception e) {
			System.out.println("检测到异常，已被捕获！");
		}finally {
			System.out.println("终止");
		}System.out.println("程序结束。。。。谢谢使用");
	}
	}
