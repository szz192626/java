package com.chinsofti.bank.test;

import com.chinasofti.bank.account.Student;

import way.PersonalAccount;

public class TestAccount {
	public static void main(String []args) {
		Student   student = new  Student("John", 18);
	  PersonalAccount  account = new PersonalAccount("85555","123",1000);
	  student.setAccount(account);
	  }
}
