package com.chinasofti.bank.account;
import java.util.Date;
public class Logger {
      //Logger 依赖Account ，使用多态参数
	public static void log(Account account ,String msg) {
		String[] logInfo=account.getLogInfo();
		int logIndex=account.getLogIndex();
//判断日志的条数，多于3条时，从第一条开始覆盖
		if(logIndex>=3) {
			logIndex=0;
		}
//使用数组保存日志记录		
		logInfo[logIndex]=new Date()+": "+msg;
		logIndex++;
		account.setLogIndex(logIndex);
	}
	//多态参数Account
	public static void printLog(Account account) {
		//Account Account =new PersonalAccount(....)
		String[] logInfo=account.getLogInfo();
		for(String s:logInfo) {
			if(s!=null) {
				//instanceof 用于判断对象的具体类型
				if(account instanceof PersonalAccount) {
			//		PersonalAccount p =(PersonalAccount )account;
					System.out.println("日志："+s+"目前余额"+account.getBalance());
				}
				if(account instanceof CreditAccount) {
					CreditAccount ca =(CreditAccount)account;
					System.out.println("日志"+s+"目前金额"+account.getBalance()+"信用卡额度："+ca.getLimit());
				}
			}else {
					break;
				}
			}
		}
	}


