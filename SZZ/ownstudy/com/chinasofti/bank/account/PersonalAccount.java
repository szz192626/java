package com.chinasofti.bank.account;


public  class PersonalAccount extends Account {
	// 无参构造方法
	public PersonalAccount() {

	}

	public PersonalAccount(String accoundId, String pwd, double balance) {
		// 子类的第一行语句，使用super调用父类的构造方法
		super(accoundId, pwd, balance);
	}

	// 定期存款，子类扩展新的方法
	public void deposit(double account, int term) {
		setBalance(getBalance() + account);
		System.out.println("定期存款，存期" + term + "个月");
		
     
	}
      //重写父类中的抽象方法
	public void withdraw(double amount) {
		if(amount<=super.getBalance()) {
			super.setBalance(super.getBalance()-amount);
			Logger.log(this, "取款成功，余额："+amount);
		}
		
	}

}
