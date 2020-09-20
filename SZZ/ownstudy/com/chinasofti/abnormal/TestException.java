package com.chinasofti.abnormal;

public class TestException {

	public static void main(String[] args) {
		int[]a =new int [3];
		a[4]=9;
		try {
		Calculator.div(12,4);
		System.out.println("try结束");
		//其他代码
		}catch(ArithmeticException e) {
			System.out.println("捕捉到异常");
		}catch(NullPointerException e) {
			System.out.println("捕获到空指针异常");
		}catch(Exception e) {
			System.out.println("捕获到其他异常");
		}
		try {
		Calculator.div(120, 0);//中断
		System.out.println("try结束");
		}catch(ArithmeticException e) {
			System.out.println("捕捉到数学异常：除数不能为0");
		}finally {
			System.out.println("finally");
		}
		try {
		Calculator.div(100, 4);
		System.out.println("try结束");
		}catch(ArithmeticException e) {
			System.out.println("捕捉到异常");
		}
		System.out.println("关闭计算器...");
	}

}
