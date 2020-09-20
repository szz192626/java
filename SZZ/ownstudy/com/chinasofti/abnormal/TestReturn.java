package com.chinasofti.abnormal;

public class TestReturn {

	public static void main(String[] args) {
		try {
		
			String a=null;
		    System.out.println(a.length());
		   //  return;
			
		}catch(NullPointerException e) {
			System.out.println("字符串为null");
		return;
			//让虚拟机强制退出
		//	System.exit(0);
		}finally {
			System.out.println("finally");
		}
          System.out.println("main方法结束");
	}

}
