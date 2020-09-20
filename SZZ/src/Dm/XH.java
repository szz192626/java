package Dm;

import java.util.Scanner;

public class XH {

	public static void main(String[] args) {
		Scanner   scanner=new  Scanner(System.in);
		System.out.println("请输入考试成绩：");
		int  score=scanner.nextInt();
		while(score<60) {
			System.out.println("再次学习");
			System.out.println("再次考试");
			System.out.println("得到考试成绩：");
			score=scanner.nextInt();
			}
		System.out.println("你过关了，真的学会了");
		
		

	}

}
