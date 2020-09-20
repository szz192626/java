package com.chinasofti.bank.account;

public class CreditAccount extends Account {
	// ���ඨ���µ�����
	private double limit;

	// ���幹�췽��
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
	//���븸�಻ͬ�������޸Ĵ���Ҫ�޸Ķ��
	//�������ǣ��길��ͬ����ͬ�Σ�ͬ����ֵ
	public  void deposit(double amount) throws DepositException {
		
		if(amount>=100000) {
			limit+=limit*1.1;
		}
		 super.deposit(amount);//�׳��쳣���õ�����������try��catch
	}
	//��д�����еĳ��󷽷�
	public void withdraw(double amount) {
		System.out.println("���ÿ�ȡ���Ҫ����Ϣ");
		if(amount<limit*0.2) {
			super.setBalance(super.getBalance()-amount);
			Logger.log(this, "���ÿ����ֳɹ�����"+amount);
		}
	}

}
