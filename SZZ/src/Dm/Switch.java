package Dm;

import java.util.Scanner;

public  class  Switch{

	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  System.out.println("请输入名次（汉字）："); 
		String str=scan.next();
     switch(str) {
		case  "一":
			System.out.println("奖励到欧洲玩一圈");
		   break;
		case "二":
			System.out.println("奖励到国内景点玩几天");
			break;
		case "三":
			System.out.println("笔记本电脑一台");
		  break;
		  default:
		System.out.println("努力");
			break;
		}
	}
}
