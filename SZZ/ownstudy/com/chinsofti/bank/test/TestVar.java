package com.chinsofti.bank.test;

import way.PersonalAccount;

public class TestVar {
//����ֱ�������ı�����������Ϊ���ԣ�����ʹ��Ȩ�޷������η���static��final
//�������������࣬��Ĭ�ϳ�ʼ��ֵ
	private PersonalAccount account;
	private int i;
	private boolean flag;
	private static double sum;
	private final int x=0;
	public void test(int i) {
//������ı�����������ʹ��Ȩ�����η�������ʹ��static������ʹ��final
//û��Ĭ��ֵ�������ֹ���ʼ����������������ѭ�ͽ�ԭ��
		double d=0.0;
//�ͽ�ԭ��ʹ�õ��Ƿ����е�i		
				i++;
//this��ʾ���ǵ�ǰ��������ã����Ե��õ�������
			this.i++;
	}
	
	 public static void main(String[] args) {
		TestVar var=new TestVar();
	}

}
