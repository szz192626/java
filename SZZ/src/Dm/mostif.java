package Dm;

import java.util.Scanner;

public class mostif {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入成绩：");
		double score = input.nextDouble();
		if (score >= 85) {
			System.out.println("优秀，奖励MP4");
		} else if (score >= 80) {
			System.out.println("良好,奖励书包");
		} else if (score >= 70) {
			System.out.println("中等，奖励本子");
		} else if (score >= 60) {
			System.out.println("及格，无奖励");
		} else {
			System.out.println("不及格，重修");
		}
	}
}
