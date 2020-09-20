package com.chinsofti.bank.test;

import way.PersonalAccount;

public class TestVar {
//类中直接声明的变量或常量，称为属性，可以使用权限访问修饰符，static，final
//作用域是整个类，有默认初始化值
	private PersonalAccount account;
	private int i;
	private boolean flag;
	private static double sum;
	private final int x=0;
	public void test(int i) {
//方法里的变量或常量不能使用权限修饰符，不能使用static，可以使用final
//没有默认值，必须手工初始化，遇到重名，遵循就近原则
		double d=0.0;
//就近原则使用的是方法中的i		
				i++;
//this表示的是当前对象的引用，所以调用的是属性
			this.i++;
	}
	
	 public static void main(String[] args) {
		TestVar var=new TestVar();
	}

}
