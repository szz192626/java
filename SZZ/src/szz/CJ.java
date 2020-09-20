package szz;

import java.util.Scanner;

public class CJ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入四位会员卡号：");
		int x = 3, y = 5, a = 6, b = 9;
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
		System.out.println("四位卡号之和");
		int bres = x + y + a + b;
		System.out.println(bres);
		System.out.println(bres > 20);
		System.out.print("是否是幸运客户取决于");
		boolean bnot = false;
		if (bnot) {
			System.out.println("条件不满足大于20");
		} else {
			System.out.println("条件满足大于20");

			scanner.close(); 
			}
}
}
