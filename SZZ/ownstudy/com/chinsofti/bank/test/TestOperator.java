package com.chinsofti.bank.test;

public class TestOperator {

	public static void main(String[] args) {
		//���������
		System.out.println("--------���������-------------------");
		int a = 2;
		int b = 3;
		System.out.println("a/b=" + a / b);
		System.out.println("a%b=" + a % b);
		int r = a < b ? a : b;
		System.out.println("a<b?a:b=" + r);
		int c, e;
		c = a++;// ��ȡֵ��������
		e = ++b;// �����ӣ���ȡֵ
		System.out.println("c=" + c + "  a=" + a);
		System.out.println("e=" + e + "  b=" + b);
		// ++,--������ǰ���Ǻ����ǶԱ������������˼�1���1�Ĳ���
		System.out.println("Test " + " operator");
		// λ�����
		System.out.println("--------λ�����---------------");
		int x = -8 >> 2;// ������λ����-8/4
		int y = -8 << 2;// ������λ����-8*4
		int z = -8 >>> 2;// �޷������ƣ����������޷������ƣ�
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
        //�Ƚ������
		System.out.println("------------�Ƚ������----------------------");
		String s1="Hello";
		String s2="word";
		int r1=s1.compareTo(s2);
		System.out.println(r1);
		//�߼������
		System.out.println("------------�߼������------------------------");
        String name="wangxh";
        String pwd="abc";
    //name�ǲ���wangxh�������ǲ��ǣ����ж�pwd�ǲ���abc
        if(name.equals("wangxh")&pwd.equals("abc")) {
        	System.out.println("��¼�ɹ�");
        }
    //name�ǲ���wangxh��������ǣ�ֱ�ӷ���false,����ǣ����ж�pwd�ǲ���abc����Ϊ��·����    
        if(name.equals("wangxh")&&pwd.equals("abc")) {
        	System.out.println("��¼�ɹ�");
        }
		String accountId=null;
		if(accountId!=null&&accountId.equals("9555")) {
			System.out.println("����������");
		}else {
			System.out.println("������ˢ��");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}