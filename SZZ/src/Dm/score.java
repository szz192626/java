package Dm;

import java.util.Scanner;

public class score {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入成绩：");
		double score = input.nextDouble();
		if (score >= 85) {
			System.out.println("优秀，奖励MP4");
		} else if (score >= 80) {
			System.out.println("良好,奖励奶茶");
		} else if (score >= 70) {
			System.out.println("中等，奖励红薯");
		} else if (score >= 60) {
			System.out.println("及格，奖励一巴掌");
		} else {
			System.out.println("不及格，捣死");
		}
	}
}
