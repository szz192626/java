package com.chinasofti.bank.account;

import java.util.Arrays;

public class TestSort {

	public static void main(String[] args) {
		Course[] courses=new Course[] {
				new Course("JAVA", 2000),new Course("DB", 800)};
//要求数组的元素必须实现Comparable接口
		Arrays.sort(courses);
		for(Course c:courses) {
			System.out.println(c);
		}
		
		
	}

}
