package com.chinasofti.bank.account;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 银行账户的父类，定义共同的属性和方法 是抽象类，定义子类的共同特征
 * 
 * @author 囧态汗
 *
 */
//定义属性
public abstract class Account {
	private String accountId;
	private String pwd;
	private double balance;
//日志数组	
	private String[] logInfo = new String[3];
	private int logIndex;

//无参构造方法  
	public Account() {
		this("1213", "000", 0.0);
		System.out.println("调用了Account()方法");
	}

	public Account(String accountId, String pwd, double balance) {
		super();
		this.accountId = accountId;
		this.pwd = pwd;
		this.balance = balance;
		System.out.println("调用Account(String accountId,String pwd,double balance)的方法");
	}

//getters和setters  

	public String getAccountId() {
		return accountId;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	// 存款,不使用异常
    //	public boolean deposit(double amount) {
	// boolean flag=true;
    //		if(amount>0&&amount<=10000) {
	// balance += amount;
	// Logger.log(this, "存款成功，金额："+amount);
	// }else {
	// flag=false;
	// }
	// return flag;
	// }
	
	//存款，使用 throws
//	public void  deposit(double amount ) throws Exception {
//		if(amount>0&&amount<=10000) {
//			balance+=amount;
//			Logger.log(this, "存款成功，金额："+amount);
//		}else {
//			//抛出异常
			 
//				throw  new Exception("存款失败");
			
//			}
//		}

	//存款， throws,层层抛出
	public void  deposit(double amount ) throws DepositException {
		if(amount>0&&amount<=10000) {
			balance+=amount;
			Logger.log(this, "存款成功，金额："+amount);
		}else {
			//抛出异常
			 try {
				throw  new DepositException("存款失败");
			 }catch(DepositException e){
				 Logger.log(this, "存款失败，金额："+amount);
			 throw e;
			 }
			}
 		}
	
	
//取款，抽象方法，定义了what to do，How to  do在子类中定义
	//当取款失败时，可能抛出异常
	public abstract void withdraw(double amount)throws Exception;

	// 对日志的数组，索引，进行修改和查询
	public String[] getLogInfo() {
		return logInfo;
	}

	public int getLogIndex() {
		return logIndex;
	}

	public void setLogIndex(int logIndex) {
		this.logIndex = logIndex;
	}

}
