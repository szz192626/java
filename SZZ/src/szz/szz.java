package szz;

public class szz {
	public static void main(String[] args) {
		System.out.println("大家好");

		// 数字型变量
		byte b1, b2;
		b1 = 4;
		b2 = 5;
		b2 = b1;
		//
		System.out.println("b1=" + b1 + ",b2=" + b2);
		// System.out.printf(“b1=%d,b2=%d\n,b1,b2);

		short s2 = 037;
		// System.out.println("s2="+s2);
		// 16进制赋值，
		// 请大家注意
		int i3 = 0x1F3E5A6B;
		// System.out.println("i3="+i3)；

		/*
		 * 二进制赋值示例 请大家注意
		 */
		int i4 = 0b111100001;
		// System.out.println(i4="+i4);

		long l4 = 400L;

		float f5 = -3.458997f;
		double d5 = 1234.987;

		double d6 = 12.4e6d;
		// System.out.println("d6="+d6);

		// 字符型
		char c6 = 'v';
		char c9 = '卡';
		char c12 = '\n';
		char c7 = '\'';
		char c8 = '\\';
		char c13 = '\141';
		char c14 = '\u6723';
		char c11 = 97;
		System.out.println("c6=" + c6);
		System.out.println("c9=" + c9);
		System.out.println("c12=" + c12);
		System.out.println("c7=" + c7);
		System.out.println("c8=" + c8);
		System.out.println("c13=" + c13);

		System.out.println("c14=" + c14);
		System.out.println("c11=" + c11);
		// 布尔型
		boolean b9 = true;
		boolean b10 = false;

	}
}