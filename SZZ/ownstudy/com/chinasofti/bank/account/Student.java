package com.chinasofti.bank.account;

import way.PersonalAccount;

public class Student {

	private String name;
	private int age;
	private PersonalAccount account;

//构造方法
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;

	}

//返回银行卡信息
	public PersonalAccount getAccount() {
		return account;
	}

//设置银行卡
	public void setAccount(PersonalAccount account) {
		this.account = account;
	}
//查看、修改年龄
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	
	
	
	
	
	
	
	
}
