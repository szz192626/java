package com.chinasofti.abnormal;

public class TestReturn {

	public static void main(String[] args) {
		try {
		
			String a=null;
		    System.out.println(a.length());
		   //  return;
			
		}catch(NullPointerException e) {
			System.out.println("�ַ���Ϊnull");
		return;
			//�������ǿ���˳�
		//	System.exit(0);
		}finally {
			System.out.println("finally");
		}
          System.out.println("main��������");
	}

}
