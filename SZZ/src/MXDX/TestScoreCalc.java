package MXDX;

import java.util.Scanner;

import Dm.score;

public class TestScoreCalc {

	public static void main(String[] args) {
		ScoreCalc scoreCalc = new ScoreCalc();

		Scanner scan = new Scanner(System.in);
		System.out.println("������Java�ɼ���");
		scoreCalc.Javascore = scan.nextFloat();
		System.out.println("������C�ɼ���");
		scoreCalc.Cscore = scan.nextFloat();
		System.out.println("������D�ɼ���");
		scoreCalc.Dscore = scan.nextFloat();
		scoreCalc.showsumscore();
		scoreCalc.showaverscore();
	}

}
