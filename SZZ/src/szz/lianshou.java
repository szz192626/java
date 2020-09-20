package szz;

import java.util.Scanner;

public class lianshou {
	private static Scanner scan;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你想输入的数字");
		int Num1 = scanner.nextInt();
		System.out.println("你输入的数字为：" + Num1);
		int x = Num1, y = 2;
		int B = x % y;
		int B1 = x + y;
		int B2 = x - y;

	}

}
