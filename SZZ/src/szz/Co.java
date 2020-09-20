package szz;

import java.util.Scanner;

public class Co {

	public static void main(String[] args) {
		double iScoreofZh = 85;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入李四同学的成绩:");

		double iScoreofLi = scanner.nextDouble();
		boolean bRes = iScoreofLi > iScoreofZh;

		System.out.println("lisi的成绩" + iScoreofLi + ",大于张三的成绩吗？" + bRes);
		scanner.close();
		if (bRes)
			
		{
			System.out.println("李四的成绩好于张三");
		}

		{
			System.out.println("李四的成绩坏于张三的成绩");
		}

	}

}
