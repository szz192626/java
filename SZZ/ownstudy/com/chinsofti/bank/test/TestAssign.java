package com.chinsofti.bank.test;

import com.chinasofti.bank.account.Student;

public class TestAssign {

	public static void main(String[] args) {
		Student stu1 = new Student("John", 18);
		Student stu2 = new Student("John", 18);
		System.out.println("stu1.age=" + stu1.getAge() + "   " + "stu2.age=" + stu2.getAge());
		stu1.setAge(20);
		System.out.println("stu1.age=" + stu1.getAge() + "   " + "stu2.age=" + stu2.getAge());
		stu1 = stu2;
		System.out.println("stu1.age=" + stu1.getAge() + "   " + "stu2.age=" + stu2.getAge());
		stu1.setAge(100);
		System.out.println("stu1.age=" + stu1.getAge() + "  " + "stu2.age=" + stu2.getAge());
		stu2.setAge(50);
		System.out.println("stu1.age=" + stu1.getAge() + "   " + "stu2.age=" + stu2.getAge());

	}

}
