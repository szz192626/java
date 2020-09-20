package ZWLX;

public class SZ4 {

	public static void main(String[] args) {
		int a[][], b;// a是一个二维数组，b是一个简单变量
		int[] c[], d;// c是一个二维数组，d是一个一维数组
		int[][] e, f;// e和f都是二维数组
		int g[][] = new int[3][4];// g所表示的数组，一共有三行，每行有四个元素
		int x[][] = new int[3][];
		x[0] = new int[5];
		x[1] = new int[10];
		x[2] = new int[20];
		// x表示一个二维数组，每一行的元素分别是5、10、20.
		// x.length (知道二维数组的行数)
		// x[i].length(知道第i行元素的个数)
		int h[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		// h数组有三行，每一行有四个元素
		for (int i = 0; i < h.length; i++) {
			for (int j = 0; j < h[i].length; j++) {
				System.out.printf("%5d", h[i][j]);
			}
			System.out.println();

		}
		System.out.println("另一个数组");
		int k[][] = { { 1 }, { 3, 5, 7 }, { 2, 4, 5, 8, 10, 12 } };
		// k数组有三行，每一行元素不一样多
		for (int i = 0; i < k.length; i++) {
			for (int j = 0; j < k[i].length; j++) {
				System.out.printf("%5d", k[i][j]);
			}
			System.out.println();

		}
		System.out.println("再一个数组");
		int l[][] = { { 10, 20, 30, 45 },
				{ 15, 25, 35, 50 },
				{ 19, 28, 38, 49 } };
		for (int i = 0; i < l.length; i++) {
			for (int j = 0; j < l[i].length; j++) {
				System.out.printf("%5d", l[i][j]);
			}
			System.out.println();

		}
		
		
		
	}

}
