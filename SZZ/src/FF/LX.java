package FF;

import java.util.Arrays;

public class LX {

	public static void main(String[] args) {
		double douarr[]=new double[] {60.7,30.6,96.3,86.6,70.8};
		int i=0;
		Arrays.sort(douarr);
		for(double x:douarr) {
			System.out.print("  "+x);
		}
		
		Arrays.fill(douarr,2,4,2.45);
		for(double x:douarr) {
			System.out.print("  "+x);
			System.out.println();
		}
	
	}

}