package com.chinsofti.bank.test;

public class TestString {

	public static void main(String[] args) {
//ʹ�ù��췽����ÿ������һ���µ��ַ���
		String s1=new String("edc");
		String ss1=new String("edc");
//ֱ��=��ֵ�����ַ���ʵ������ȡֵ
		String s2 ="etc";
		String ss2="etc";
		System.out.println(s1==ss1);//false
		System.out.println(s2==ss2);//true
		System.out.println(s1==s2);//false
//�����췽����ֱ�Ӹ�ֵ		
		if(s1=="etc") {
			System.out.println("s1��ֵ��etc");
		}else {
			System.out.println("s1��ֵ����etc");
		}
		if(s2=="etc") {
			System.out.println("s2��ֵ��etc");
		}else {
			System.out.println("s2��ֵ����etc");
		}
// �����Ƚ��ַ�����ֵ����equals����������ʹ��==
		if(s1.equals("edc")) {
			System.out.println("s1��ֵ��edc");
		}else {
			System.out.println("s1��ֵ����etc");
		}
//String �б�ɴ�д�ķ���
		
//���ڴ����޸�		
		String s3=s1.toUpperCase();
		System.out.println(s1+"  "+s3);
//�ⲿֱ���޸�(��ʱ�Ͳ�����ԭ��s1)
	   s1=s1.toUpperCase();
	   System.out.println(s1);
//String �ַ����ĳ��� ����		
        System.out.println(s1.length());
        System.out.println(s2.length());

	}

}
