package szz;

import java.util.Scanner;

public class Co {

	public static void main(String[] args) {
		double iScoreofZh = 85;
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������ͬѧ�ĳɼ�:");

		double iScoreofLi = scanner.nextDouble();
		boolean bRes = iScoreofLi > iScoreofZh;

		System.out.println("lisi�ĳɼ�" + iScoreofLi + ",���������ĳɼ���" + bRes);
		scanner.close();
		if (bRes)
			
		{
			System.out.println("���ĵĳɼ���������");
		}

		{
			System.out.println("���ĵĳɼ����������ĳɼ�");
		}

	}

}
