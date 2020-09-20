package com.chinasofti.bank.account;

public class CreditAccount extends Account {
	// 子类定义新的属性
	private double limit;

	// 定义构造方法
	public CreditAccount(String accoundId, String pwd, double balance, double limit) {
		super(accoundId, pwd, balance);
		this.limit = limit;
	}

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}
	//存款，与父类不同，除了修改存款，还要修改额度
	//方法覆盖，雨父类同名，同参，同返回值
	public  void deposit(double amount) throws DepositException {
		
		if(amount>=100000) {
			limit+=limit*1.1;
		}
		 super.deposit(amount);//抛出异常，让掉用它的人再try，catch
	}
	//重写父类中的抽象方法
	public void withdraw(double amount) {
		System.out.println("信用卡取款，需要交利息");
		if(amount<limit*0.2) {
			super.setBalance(super.getBalance()-amount);
			Logger.log(this, "信用卡体现成功，余额："+amount);
		}
	}

}
