package com.chinasofti.bank.account;

import java.util.Arrays;

public class TestSort {

	public static void main(String[] args) {
		Course[] courses=new Course[] {
				new Course("JAVA", 2000),new Course("DB", 800)};
//Ҫ�������Ԫ�ر���ʵ��Comparable�ӿ�
		Arrays.sort(courses);
		for(Course c:courses) {
			System.out.println(c);
		}
		
		
	}

}
