package com.chinasofti.bank.account;

public class TestCredit {

	public static void main(String[] args) {
		PersonalAccount a1 = new PersonalAccount("212", "12112", 1000);
//		if(a1.deposit(-2000)) {
		// System.out.println("���ɹ�����ӡƾƱ");
		// }else {
		// System.out.println("���ʧ��");
		// }
		try {
			String a=null;
		    a.toUpperCase();
			a1.deposit(-2000);
		} catch (DepositException e) {
			
			System.out.println("ATM������Ϊ��������������10000");
		}catch(Exception e) {
           System.out.println("���ɹ����������쳣���ɺ���");			
		}
		System.out.println(a1.getBalance());
	}

}
