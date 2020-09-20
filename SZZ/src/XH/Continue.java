package XH;

public class Continue {

	public static void main(String[] args) {
		int sum = 0;
		 for (int j = 1; j < 5; j++) {

			sum = 0;
			System.out.printf("外层第%d运算\n", j);
			for (int i = 1; i <= 10; i++) {
				System.out.printf("内层为%d\n", i);
				if (i % 2 != 0 && j % 2 == 1) {
					continue ;
				}
				sum = sum + i;

			}
			System.out.printf("外层第%d运算，得到的和为%d\n", j, sum);
		}
	}

}
