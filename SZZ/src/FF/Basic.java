package FF;

public class Basic {

	public static void main(String[] args) {

		/*
		 * int[][] arr2D = new int[10][5]; for (int i = 0; i < arr2D.length; i++) { for
		 * (int j = 0; j < arr2D[0].length; j++) { arr2D[i][j] = (int) (100 *
		 * Math.random()); }
		 * 
		 * } arr2D[9][4] = 94;
		 * 
		 * System.out.println(arr2D); System.out.println(arr2D[9]);
		 * System.out.println(arr2D[9][4]); // ��ά����ı��� // ��һ�㣬�������ǣ�ָ��һάint�������ÿ������ for
		 * (int[] row : arr2D) { // �ڶ��㣬��������,һά����ָ���Ԫ�� for (int element : row) {
		 * System.out.print("  " + element); } System.out.println(); }
		 */

		char[][] chunxiao = new char[4][];
		chunxiao[0] = new char[5];
		chunxiao[0][0] = '��';
		chunxiao[0][1] = '��';
		chunxiao[0][2] = '��';
		chunxiao[0][3] = '��';
		chunxiao[0][4] = '��';

		chunxiao[1] = new char[] { '��', '��', '��', '��', '��' };
		chunxiao[2] = new char[] { 'ҹ', '��', '��', '��', '��' };
		chunxiao[3] = new char[] { '��', '��', '֪', '��', '��' };

		for (char[] clause : chunxiao) {
			for (char word : clause) {
				System.out.print("  " + word);
			}
			System.out.println();
		}

		System.out.println("---------��ʫ��˳��---------");
		for (int i = 0; i < chunxiao[0].length; i++) {
			for (int j = 0; j < chunxiao.length; j++) {
				System.out.print("  " + chunxiao[chunxiao.length - 1 - j][i]);
			}
			System.out.println();
		}
	}
}
