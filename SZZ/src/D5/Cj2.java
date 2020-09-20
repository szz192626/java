package D5;

public class Cj2 {

	public static void main(String[] args) {
		int num = 4572;
		int baiwei = num / 100 % 10;
		double rands = Math.random();
		int randint = (int) (rands * 10);
		System.out.println(randint);
		if (baiwei == randint) {
			System.out.println("是幸运会员");
		} else {
			System.out.println("不是幸运会员");

		}

	}

}
