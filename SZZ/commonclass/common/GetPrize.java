package common;

import java.util.Random;

public class GetPrize {

	public static void main(String[] args) {
		int[] weight=new int[50];
		double total=50.0;
		Random random=new Random();
        int sum=0;
		for(int i=0;i<weight.length;i++) {		
			weight[i]=random.nextInt(100);
	    sum+=weight[i];
		}
		for(int i=0;i<weight.length-1;i++) {
			double prize=Math.floor((double)weight[i]/(double)sum*50.0*100)/100;
			total =total-prize;
			System.out.println("第"+(i+1)+"个红包的金额为:"+prize);
			}
		System.out.println("最后一个红包的金额为："+Math.floor((total*1000+5.0)/10)/100);
	}

}
