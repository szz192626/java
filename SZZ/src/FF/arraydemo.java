package FF;

import java.util.Arrays;

import XH.For;

public class arraydemo {

	public static void main(String[] args) {
		double[]douarr=new double[] {2.0,4.0,1.59,13.5,1.7};
		for(int i=0;i<douarr.length;i++) {
		    System.out.print(" "+douarr[i]);
	}
	 System.out.println();
	 //��ǿ��forѭ��
	/* for(double x:douarr){
		 System.out.print(" "+x);
	 }  */
   double temp=douarr[0];
     int   index=0;
	 for(int i=0;i<douarr.length-1;i++) {
		 temp=douarr[i];
		 index=i;
		 int  j=i+1;
		 for( ;j<douarr.length-1;j++) {
			 if(douarr[j]<temp) {
				 temp=douarr[j];
				 index=j;
				 }
		 }
		 if(i!=j) {
		 double temp1=douarr[i];
		 douarr[i]=douarr[j];
		 douarr[j]=temp1;
	 }
	 for(double x:douarr){
		 System.out.print(" "+x);
	        Arrays.sort(douarr);
	 }
	 
	}
	}
}
