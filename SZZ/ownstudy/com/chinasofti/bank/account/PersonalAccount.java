package com.chinasofti.bank.account;


public  class PersonalAccount extends Account {
	// �޲ι��췽��
	public PersonalAccount() {

	}

	public PersonalAccount(String accoundId, String pwd, double balance) {
		// ����ĵ�һ����䣬ʹ��super���ø���Ĺ��췽��
		super(accoundId, pwd, balance);
	}

	// ���ڴ�������չ�µķ���
	public void deposit(double account, int term) {
		setBalance(getBalance() + account);
		System.out.println("���ڴ�����" + term + "����");
		
     
	}
      //��д�����еĳ��󷽷�
	public void withdraw(double amount) {
		if(amount<=super.getBalance()) {
			super.setBalance(super.getBalance()-amount);
			Logger.log(this, "ȡ��ɹ�����"+amount);
		}
		
	}

}
