package FF;

import java.util.Scanner;

public class HFSZFFSZ {

	public static void main(String[] args) {
		int[] a = new int[] { 0, 8, 4, 2, 7, 5, 1, 9, 7, 3 };
		int HF = 0, FF = 0, i = 0;
		for (i = 0; i < a.length; i++) {
			if (a[i] == 1 || a[i] == 2 || a[i] == 3) {
				HF++;
			} else {
				FF++;
			}
		}
		System.out.println("�Ϸ����ֵĸ���Ϊ��" + HF);
		System.out.println("�Ƿ����ֵĸ���Ϊ��" + FF);

	}
}
