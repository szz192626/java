package szz;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("�������������������");
		int days = scanner.nextInt();

		System.out.println("�����������Ϊ��" + days);

		int x = days, y = 2;
		int r1 = x + y;
		int r2 = x - y;
		int r3 = x * y;
		int r4 = x / y;
		int r5 = x % y;

		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);

	}
}