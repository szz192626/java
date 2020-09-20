package com.chinsofti.bank.test;

import way.PersonalAccount;

public class TestByReference {
	public void test(PersonalAccount a) {

		a.deposit(2000);
		System.out.println("test方法中a的方法余额=" + a.getBalance());
	}

	// String类，包装器类，按照基本数据类型传递
	public void testInteget(Integer i) {
		i++;
		System.out.println("形式参数i：" + i);
	}

	public static void main(String[] args) {
		PersonalAccount a = new PersonalAccount("3333", "123", 1900);
		TestByReference t = new TestByReference();
		t.test(a);
		System.out.println("main方法中a的余额=" + a.getBalance());

		Integer i = 100;
		t.testInteget(i);
		System.out.println("实际参数i：" + i);
	}

}
