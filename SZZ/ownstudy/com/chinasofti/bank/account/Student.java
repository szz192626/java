package com.chinasofti.bank.account;

import way.PersonalAccount;

public class Student {

	private String name;
	private int age;
	private PersonalAccount account;

//���췽��
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;

	}

//�������п���Ϣ
	public PersonalAccount getAccount() {
		return account;
	}

//�������п�
	public void setAccount(PersonalAccount account) {
		this.account = account;
	}
//�鿴���޸�����
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	
	
	
	
	
	
	
	
}
