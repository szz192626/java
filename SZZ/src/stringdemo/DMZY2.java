package stringdemo;

import java.util.Scanner;

public class DMZY2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������������Ϣ��");
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
			System.out.println("��Ϣ�������������룺");
			str = scan.next();
		} while (true);
		System.out.println("��Ϣ��ȷ");
	}

}
