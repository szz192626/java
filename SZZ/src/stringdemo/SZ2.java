package stringdemo;

import java.util.Scanner;

public class SZ2 {

	public static void main(String[] args) {

		int num = 0;
		double re = 0;
		double[][] arr1 = new double[5][];
		double[][] arr2 = new double[5][4];
		double[] sum = new double[5];
		double[] ave = new double[5];

		int i, j;
		for (i = 0; i < arr1.length; i++) {
			num = (int) (2 * Math.random() + 3);
			arr1[i] = new double[num];
			System.out.printf("存放第%d位学生的%d门成绩：\n", i + 1, num);

			Scanner scan = new Scanner(System.in);
			for (j = 0; j < num; j++) {
				System.out.printf("请输入该学生的第%d门课成绩\n:", j + 1);
				arr1[i][j] = scan.nextDouble();
			}

		}

		for (i = 0; i < arr1.length; i++) {
			for (j = 0; j < arr1[i].length; j++) {
				sum[i] += arr1[i][j];
			}
			ave[i] = sum[i] / arr1[i].length;
		}

		for (i = 0; i < arr1.length; i++) {
			for (int cs = 0; cs < arr1[i].length - 1; cs++) {
				for (j = 0; j < arr1[i].length - 1 - cs; j++) {
					if (arr1[i][j] > arr1[i][j + 1]) {
						re = arr1[i][j];
						arr1[i][j] = arr1[i][j + 1];
						arr1[i][j + 1] = re;
					}
				}
			}
		}

		for (i = 0, j = 0; i < arr1.length; i++) {

			arr2[i][j] = sum[i];
			arr2[i][j + 1] = ave[i];
            arr2[i][j + 2] = arr1[i][arr1[i].length - 1];
			arr2[i][j + 3] = arr1[i][j];

		}
		System.out.println("总分" + "\t" + "平均分" + "\t" + "最大值" + "\t" + "最小值" + "\t");
		for (i = 0; i < 5; i++) {
			System.out.print("第" + (i + 1) + "名同学");
			for (j = 0; j < 4; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();

		}
	}
}
