package com.chinsofti.bank.test;

public class TestFinal {
//��̬����
	private static final int LEVEL_VALUE = 1;
	private int index;
	private static final double pai = 3.14;
//������ÿһ�����췽����Ϊ�丳ֵ
	private final int num;
	private final int level;

	public TestFinal() {
		num = 9;
		level = 0;
	}

	public TestFinal(int index) {
		this.index = index;
		level = 1;
		num = 0;
	}

	public void test(final int x) {
		final int y = 0;

	}

	public static void main(String[] args) {
		System.out.println(TestFinal.LEVEL_VALUE);
		TestFinal testFinal = new TestFinal();

	}

}
