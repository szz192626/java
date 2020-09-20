package way;

/**
 * 方法重载
 * 
 * @author 囧态汗
 *
 */
public class OverloadTest {
//定义一个方法求两个整数的相加
	public void add(int a, int b) {
		int sum = a + b;
		System.out.println("两个整数相加的和是：" + (a + b));
	}

//定义一个方法求三个整数的相加
	public int add(int a, int b, int c) {
		return a + b + c;
	}

//定义一个方法求两个浮点数的相加
	public double add(double a, double b) {
		return a + b;
	}

//定义一个方法求一个整数和小数的相加
	public void add(int a, double b) {
		double sum = a + b;
		System.out.println("两个整数相加的和是：" + sum);
	}

}
