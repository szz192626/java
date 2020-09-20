package com.chinasofti.bank.account;
import java.util.Date;
public class Logger {
      //Logger ����Account ��ʹ�ö�̬����
	public static void log(Account account ,String msg) {
		String[] logInfo=account.getLogInfo();
		int logIndex=account.getLogIndex();
//�ж���־������������3��ʱ���ӵ�һ����ʼ����
		if(logIndex>=3) {
			logIndex=0;
		}
//ʹ�����鱣����־��¼		
		logInfo[logIndex]=new Date()+": "+msg;
		logIndex++;
		account.setLogIndex(logIndex);
	}
	//��̬����Account
	public static void printLog(Account account) {
		//Account Account =new PersonalAccount(....)
		String[] logInfo=account.getLogInfo();
		for(String s:logInfo) {
			if(s!=null) {
				//instanceof �����ж϶���ľ�������
				if(account instanceof PersonalAccount) {
			//		PersonalAccount p =(PersonalAccount )account;
					System.out.println("��־��"+s+"Ŀǰ���"+account.getBalance());
				}
				if(account instanceof CreditAccount) {
					CreditAccount ca =(CreditAccount)account;
					System.out.println("��־"+s+"Ŀǰ���"+account.getBalance()+"���ÿ���ȣ�"+ca.getLimit());
				}
			}else {
					break;
				}
			}
		}
	}


