package com.chinasofti.bank.account;

public class TestAccount {
  
	public  static void main(String[]  args) {
		//复用父类中的属性和方法
		PersonalAccount personalAccount =new PersonalAccount();
		personalAccount.setBalance(1000); 
		try {
			personalAccount.deposit(3000);
		} catch (Exception e1) {
			System.out.println("ATM：不能为负数，且最多存入10000");
		}
		personalAccount.deposit(2000,6);
		System.out.println(personalAccount.getBalance());
		PersonalAccount personalAccount2=new PersonalAccount("12312","52088",2000);
		System.out.println(personalAccount2.getBalance());
		CreditAccount creditAccount=new CreditAccount("222", "12123", 0.0, 10000);
		try {
			creditAccount.deposit(100000);
		} catch (Exception e1) {
			System.out.println("ATM：不能为负数，且最多存入10000");
		}//使用了方法覆盖
		System.out.println(creditAccount.getLimit());
		//抽象类不能实例化
	//	Account account=new Account();
		//编译期类型是父类，运行期类型是子类,父类引用指向子类对象
	//	Account a=new PersonalAccount("12123","1212",2000);
		PersonalAccount a=new PersonalAccount("12123","1212",2000);
		try {
			a.deposit(2000);
		} catch (Exception e) {
			System.out.println("ATM：不能为负数，且最多存入10000");
		}
		a.withdraw(1000);
		//强制类型转换
        //向下造型
		PersonalAccount b= (PersonalAccount)a;
		b.deposit(2000,12);
	//	Account ca=new CreditAccount("123121", "1213", 2000, 2000);
	    CreditAccount ca=new CreditAccount("123121", "1213", 2000, 2000);
		ca.withdraw(2000);
		Logger.printLog(a);
		Logger.printLog(ca);
		}
	
}
