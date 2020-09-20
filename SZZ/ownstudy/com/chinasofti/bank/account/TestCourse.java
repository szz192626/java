package com.chinasofti.bank.account;


public class TestCourse {
        //多态参数，父类引用指向子类对象
	public static void test(Object o) {
		
	}
	//Object称为对象型的数组，只能接受保存引用类型的数组
	public static void testArray(Object[] o ) {
      
	}
	
	
	
	public static void main(String[] args) {
	//Course ts=new Course();
	//int []a =new int[3];
	//Course [] courses  = new Course[3];
	//int b=9;
	//test(ts);
	//test(a);
	//test(b);
	//test(courses);
	//testArray(courses);
	//}
    Course c=new Course("JAVA", 2000);
    String sc=c.toString();
    int[] a=new int[3];
    System.out.println(a.toString());
	System.out.println(sc);
	//默认调用了c.toSring方法
	System.out.println(c);
	Course c1=new Course("c", 2000);
	Course c2=new Course("c", 2000);
    System.out.println(c1.equals(c2));//false--->true(经过了覆盖)
	System.out.println(c1==c2);
	String s1 =new String("Hello");
	String s2 =new String("Hello");
	System.out.println(s1.equals(s1));//false--->true(经过了覆盖)
	System.out.println(s1==s2);//false
	}
}
