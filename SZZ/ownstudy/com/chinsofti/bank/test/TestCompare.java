package com.chinsofti.bank.test;

import com.chinasofti.bank.account.Student;

public class TestCompare {

	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		System.out.println(x == y);
		double m = 0.3;
		float n = 0.3f;
		System.out.println(m == n);
		double i = 0.5;
		float j = 0.5f;
		System.out.println(i == j);
		Student stu1 = new Student("John", 18);
		Student stu2 = new Student("John", 18);
		System.out.println(stu1==stu2);
		stu1 = stu2;
		System.out.println(stu1 == stu2);

	}

}
