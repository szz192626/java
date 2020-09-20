package com.chinsofti.bank.test;

public class TestString {

	public static void main(String[] args) {
//使用构造方法，每次生成一个新的字符串
		String s1=new String("edc");
		String ss1=new String("edc");
//直接=赋值，从字符串实例池中取值
		String s2 ="etc";
		String ss2="etc";
		System.out.println(s1==ss1);//false
		System.out.println(s2==ss2);//true
		System.out.println(s1==s2);//false
//区别构造方法和直接赋值		
		if(s1=="etc") {
			System.out.println("s1的值是etc");
		}else {
			System.out.println("s1的值不是etc");
		}
		if(s2=="etc") {
			System.out.println("s2的值是etc");
		}else {
			System.out.println("s2的值不是etc");
		}
// 如果想比较字符串的值，用equals方法，不能使用==
		if(s1.equals("edc")) {
			System.out.println("s1的值是edc");
		}else {
			System.out.println("s1的值不是etc");
		}
//String 中变成大写的方法
		
//在内存中修改		
		String s3=s1.toUpperCase();
		System.out.println(s1+"  "+s3);
//外部直接修改(此时就不存在原来s1)
	   s1=s1.toUpperCase();
	   System.out.println(s1);
//String 字符串的长度 方法		
        System.out.println(s1.length());
        System.out.println(s2.length());

	}

}
