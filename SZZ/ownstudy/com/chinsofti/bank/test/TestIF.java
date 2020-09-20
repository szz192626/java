package com.chinsofti.bank.test;

public class TestIF {

	public static void main(String[] args) {
		int score = 80;
		if (score < 60) {
			System.out.println("不及格");
		} else if (score < 70) {
			System.out.println("及格");
		} else if (score < 85) {
			System.out.println("良好");
		} else {
			System.out.println("优秀");
		}
		//if else 与 三目
		int a=2;
		if(a<1) {
			a++;
			System.out.println("a="+a);
		}else {
			a--;
			System.out.println("a="+a);
		}
		//三目
         a=a>1?a++:a--;
         System.out.println("a="+a);
	}

}
