package com.chinsofti.bank.test;

public class TestIF {

	public static void main(String[] args) {
		int score = 80;
		if (score < 60) {
			System.out.println("������");
		} else if (score < 70) {
			System.out.println("����");
		} else if (score < 85) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
		//if else �� ��Ŀ
		int a=2;
		if(a<1) {
			a++;
			System.out.println("a="+a);
		}else {
			a--;
			System.out.println("a="+a);
		}
		//��Ŀ
         a=a>1?a++:a--;
         System.out.println("a="+a);
	}

}
