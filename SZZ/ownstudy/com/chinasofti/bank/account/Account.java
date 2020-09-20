package com.chinasofti.bank.account;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * �����˻��ĸ��࣬���干ͬ�����Ժͷ��� �ǳ����࣬��������Ĺ�ͬ����
 * 
 * @author ��̬��
 *
 */
//��������
public abstract class Account {
	private String accountId;
	private String pwd;
	private double balance;
//��־����	
	private String[] logInfo = new String[3];
	private int logIndex;

//�޲ι��췽��  
	public Account() {
		this("1213", "000", 0.0);
		System.out.println("������Account()����");
	}

	public Account(String accountId, String pwd, double balance) {
		super();
		this.accountId = accountId;
		this.pwd = pwd;
		this.balance = balance;
		System.out.println("����Account(String accountId,String pwd,double balance)�ķ���");
	}

//getters��setters  

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

	// ���,��ʹ���쳣
    //	public boolean deposit(double amount) {
	// boolean flag=true;
    //		if(amount>0&&amount<=10000) {
	// balance += amount;
	// Logger.log(this, "���ɹ�����"+amount);
	// }else {
	// flag=false;
	// }
	// return flag;
	// }
	
	//��ʹ�� throws
//	public void  deposit(double amount ) throws Exception {
//		if(amount>0&&amount<=10000) {
//			balance+=amount;
//			Logger.log(this, "���ɹ�����"+amount);
//		}else {
//			//�׳��쳣
			 
//				throw  new Exception("���ʧ��");
			
//			}
//		}

	//�� throws,����׳�
	public void  deposit(double amount ) throws DepositException {
		if(amount>0&&amount<=10000) {
			balance+=amount;
			Logger.log(this, "���ɹ�����"+amount);
		}else {
			//�׳��쳣
			 try {
				throw  new DepositException("���ʧ��");
			 }catch(DepositException e){
				 Logger.log(this, "���ʧ�ܣ���"+amount);
			 throw e;
			 }
			}
 		}
	
	
//ȡ����󷽷���������what to do��How to  do�������ж���
	//��ȡ��ʧ��ʱ�������׳��쳣
	public abstract void withdraw(double amount)throws Exception;

	// ����־�����飬�����������޸ĺͲ�ѯ
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
