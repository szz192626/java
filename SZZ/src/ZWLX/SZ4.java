package ZWLX;

public class SZ4 {

	public static void main(String[] args) {
		int a[][], b;// a��һ����ά���飬b��һ���򵥱���
		int[] c[], d;// c��һ����ά���飬d��һ��һά����
		int[][] e, f;// e��f���Ƕ�ά����
		int g[][] = new int[3][4];// g����ʾ�����飬һ�������У�ÿ�����ĸ�Ԫ��
		int x[][] = new int[3][];
		x[0] = new int[5];
		x[1] = new int[10];
		x[2] = new int[20];
		// x��ʾһ����ά���飬ÿһ�е�Ԫ�طֱ���5��10��20.
		// x.length (֪����ά���������)
		// x[i].length(֪����i��Ԫ�صĸ���)
		int h[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		// h���������У�ÿһ�����ĸ�Ԫ��
		for (int i = 0; i < h.length; i++) {
			for (int j = 0; j < h[i].length; j++) {
				System.out.printf("%5d", h[i][j]);
			}
			System.out.println();

		}
		System.out.println("��һ������");
		int k[][] = { { 1 }, { 3, 5, 7 }, { 2, 4, 5, 8, 10, 12 } };
		// k���������У�ÿһ��Ԫ�ز�һ����
		for (int i = 0; i < k.length; i++) {
			for (int j = 0; j < k[i].length; j++) {
				System.out.printf("%5d", k[i][j]);
			}
			System.out.println();

		}
		System.out.println("��һ������");
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
