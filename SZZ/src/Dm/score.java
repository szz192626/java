package Dm;

import java.util.Scanner;

public class score {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ɼ���");
		double score = input.nextDouble();
		if (score >= 85) {
			System.out.println("���㣬����MP4");
		} else if (score >= 80) {
			System.out.println("����,�����̲�");
		} else if (score >= 70) {
			System.out.println("�еȣ���������");
		} else if (score >= 60) {
			System.out.println("���񣬽���һ����");
		} else {
			System.out.println("�����񣬵���");
		}
	}
}
