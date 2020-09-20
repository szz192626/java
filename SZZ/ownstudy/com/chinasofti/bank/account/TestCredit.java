package com.chinasofti.bank.account;

public class TestCredit {

	public static void main(String[] args) {
		PersonalAccount a1 = new PersonalAccount("212", "12112", 1000);
//		if(a1.deposit(-2000)) {
		// System.out.println("存款成功，打印凭票");
		// }else {
		// System.out.println("存款失败");
		// }
		try {
			String a=null;
		    a.toUpperCase();
			a1.deposit(-2000);
		} catch (DepositException e) {
			
			System.out.println("ATM：不能为负数，且最多存入10000");
		}catch(Exception e) {
           System.out.println("存款成功，有其他异常，可忽略");			
		}
		System.out.println(a1.getBalance());
	}

}
