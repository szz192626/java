package XH;

import Dm.score;

public class array {

	public static void main(String[] args) {
		double[] scores;
	 scores=new double[40];
		scores[0]=85;
	scores[19]=65;
		scores[39]=90; 
		
		System.out.println(scores);
		for(int i=0;i<scores.length;i++) {
		  System.out.println(scores[i]);
		}
		
		}

}
