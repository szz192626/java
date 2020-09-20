package com.chinsofti.bank.test;

public class TestOperator {

	public static void main(String[] args) {
		//算数运算符
		System.out.println("--------算数运算符-------------------");
		int a = 2;
		int b = 3;
		System.out.println("a/b=" + a / b);
		System.out.println("a%b=" + a % b);
		int r = a < b ? a : b;
		System.out.println("a<b?a:b=" + r);
		int c, e;
		c = a++;// 先取值，再增加
		e = ++b;// 先增加，再取值
		System.out.println("c=" + c + "  a=" + a);
		System.out.println("e=" + e + "  b=" + b);
		// ++,--不论在前还是后，总是对变量本身进行了加1或减1的操作
		System.out.println("Test " + " operator");
		// 位运算符
		System.out.println("--------位运算符---------------");
		int x = -8 >> 2;// 右移两位，即-8/4
		int y = -8 << 2;// 左移两位，即-8*4
		int z = -8 >>> 2;// 无符号右移，（不存在无符号左移）
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
        //比较运算符
		System.out.println("------------比较运算符----------------------");
		String s1="Hello";
		String s2="word";
		int r1=s1.compareTo(s2);
		System.out.println(r1);
		//逻辑运算符
		System.out.println("------------逻辑运算符------------------------");
        String name="wangxh";
        String pwd="abc";
    //name是不是wangxh，不管是不是，先判断pwd是不是abc
        if(name.equals("wangxh")&pwd.equals("abc")) {
        	System.out.println("登录成功");
        }
    //name是不是wangxh，如果不是，直接返回false,如果是，再判断pwd是不是abc，称为短路现象    
        if(name.equals("wangxh")&&pwd.equals("abc")) {
        	System.out.println("登录成功");
        }
		String accountId=null;
		if(accountId!=null&&accountId.equals("9555")) {
			System.out.println("请输入密码");
		}else {
			System.out.println("请重新刷卡");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
