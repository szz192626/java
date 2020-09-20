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
		 * System.out.println(arr2D[9][4]); // 二维数组的遍历 // 第一层，遍历的是，指向一维int型数组的每个引用 for
		 * (int[] row : arr2D) { // 第二层，遍历的是,一维引用指向的元素 for (int element : row) {
		 * System.out.print("  " + element); } System.out.println(); }
		 */

		char[][] chunxiao = new char[4][];
		chunxiao[0] = new char[5];
		chunxiao[0][0] = '春';
		chunxiao[0][1] = '眠';
		chunxiao[0][2] = '不';
		chunxiao[0][3] = '觉';
		chunxiao[0][4] = '晓';

		chunxiao[1] = new char[] { '处', '处', '闻', '啼', '鸟' };
		chunxiao[2] = new char[] { '夜', '来', '风', '雨', '声' };
		chunxiao[3] = new char[] { '花', '落', '知', '多', '少' };

		for (char[] clause : chunxiao) {
			for (char word : clause) {
				System.out.print("  " + word);
			}
			System.out.println();
		}

		System.out.println("---------古诗词顺序---------");
		for (int i = 0; i < chunxiao[0].length; i++) {
			for (int j = 0; j < chunxiao.length; j++) {
				System.out.print("  " + chunxiao[chunxiao.length - 1 - j][i]);
			}
			System.out.println();
		}
	}
}
