package com.chinasofti.bank.account;

public class TestAccount {
  
	public  static void main(String[]  args) {
		//���ø����е����Ժͷ���
		PersonalAccount personalAccount =new PersonalAccount();
		personalAccount.setBalance(1000); 
		try {
			personalAccount.deposit(3000);
		} catch (Exception e1) {
			System.out.println("ATM������Ϊ��������������10000");
		}
		personalAccount.deposit(2000,6);
		System.out.println(personalAccount.getBalance());
		PersonalAccount personalAccount2=new PersonalAccount("12312","52088",2000);
		System.out.println(personalAccount2.getBalance());
		CreditAccount creditAccount=new CreditAccount("222", "12123", 0.0, 10000);
		try {
			creditAccount.deposit(100000);
		} catch (Exception e1) {
			System.out.println("ATM������Ϊ��������������10000");
		}//ʹ���˷�������
		System.out.println(creditAccount.getLimit());
		//�����಻��ʵ����
	//	Account account=new Account();
		//�����������Ǹ��࣬����������������,��������ָ���������
	//	Account a=new PersonalAccount("12123","1212",2000);
		PersonalAccount a=new PersonalAccount("12123","1212",2000);
		try {
			a.deposit(2000);
		} catch (Exception e) {
			System.out.println("ATM������Ϊ��������������10000");
		}
		a.withdraw(1000);
		//ǿ������ת��
        //��������
		PersonalAccount b= (PersonalAccount)a;
		b.deposit(2000,12);
	//	Account ca=new CreditAccount("123121", "1213", 2000, 2000);
	    CreditAccount ca=new CreditAccount("123121", "1213", 2000, 2000);
		ca.withdraw(2000);
		Logger.printLog(a);
		Logger.printLog(ca);
		}
	
}
