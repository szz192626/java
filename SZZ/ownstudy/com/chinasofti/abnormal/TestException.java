package com.chinasofti.abnormal;

public class TestException {

	public static void main(String[] args) {
		int[]a =new int [3];
		a[4]=9;
		try {
		Calculator.div(12,4);
		System.out.println("try����");
		//��������
		}catch(ArithmeticException e) {
			System.out.println("��׽���쳣");
		}catch(NullPointerException e) {
			System.out.println("���񵽿�ָ���쳣");
		}catch(Exception e) {
			System.out.println("���������쳣");
		}
		try {
		Calculator.div(120, 0);//�ж�
		System.out.println("try����");
		}catch(ArithmeticException e) {
			System.out.println("��׽����ѧ�쳣����������Ϊ0");
		}finally {
			System.out.println("finally");
		}
		try {
		Calculator.div(100, 4);
		System.out.println("try����");
		}catch(ArithmeticException e) {
			System.out.println("��׽���쳣");
		}
		System.out.println("�رռ�����...");
	}

}
