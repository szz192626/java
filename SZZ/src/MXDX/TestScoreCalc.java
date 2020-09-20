package MXDX;

import java.util.Scanner;

import Dm.score;

public class TestScoreCalc {

	public static void main(String[] args) {
		ScoreCalc scoreCalc = new ScoreCalc();

		Scanner scan = new Scanner(System.in);
		System.out.println("请输入Java成绩：");
		scoreCalc.Javascore = scan.nextFloat();
		System.out.println("请输入C成绩：");
		scoreCalc.Cscore = scan.nextFloat();
		System.out.println("请输入D成绩：");
		scoreCalc.Dscore = scan.nextFloat();
		scoreCalc.showsumscore();
		scoreCalc.showaverscore();
	}

}
