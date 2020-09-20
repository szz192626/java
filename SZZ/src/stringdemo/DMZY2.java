package stringdemo;

import java.util.Scanner;

public class DMZY2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入生日信息：");
		String str = scan.next();
		do {
			String[] strarr = str.split("/");
			boolean isTwoNum1 = strarr[0].matches("\\d{2}");
			boolean isTwoNum2 = strarr[1].matches("\\d{2}");
			int month = Integer.parseInt(strarr[0]);
			int date = Integer.parseInt(strarr[1]);

			if (isTwoNum1 && isTwoNum2) {
				if (month <= 12 && date <= 31) {

					break;
				}

			}
			System.out.println("信息错误，请重新输入：");
			str = scan.next();
		} while (true);
		System.out.println("信息正确");
	}

}
