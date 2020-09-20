package MXDX;

import java.util.Scanner;

public class ScoreCalc {
   float Javascore, Cscore, Dscore, average, sum;
    public float sumscore() {
        sum = this.Javascore + this.Cscore + this.Dscore;
        
		return sum;
	}
    public float averscore() {
		average = (this.Javascore + this.Cscore + this.Dscore) / 3;
		
		return average;
	}
    public void showsumscore() {
        System.out.println("总成绩为：" + sumscore());
    }
    public void showaverscore() {
		System.out.println("平均成绩为：" + averscore());
	}

}
