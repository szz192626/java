package com.chinsofti.bank.test;

import way.PersonalAccount;

public class TestByReference {
	public void test(PersonalAccount a) {

		a.deposit(2000);
		System.out.println("test������a�ķ������=" + a.getBalance());
	}

	// String�࣬��װ���࣬���ջ����������ʹ���
	public void testInteget(Integer i) {
		i++;
		System.out.println("��ʽ����i��" + i);
	}

	public static void main(String[] args) {
		PersonalAccount a = new PersonalAccount("3333", "123", 1900);
		TestByReference t = new TestByReference();
		t.test(a);
		System.out.println("main������a�����=" + a.getBalance());

		Integer i = 100;
		t.testInteget(i);
		System.out.println("ʵ�ʲ���i��" + i);
	}

}
