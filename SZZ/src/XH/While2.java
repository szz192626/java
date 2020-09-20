package XH;

public class While2 {

	public static void main(String[] args) {
		
		double  Num=0;
        double  Sum=0; 
		while(Num>=0&&Num<=50) {
			if(Num%7==0) {
				Sum=Sum+Num;
			}
			
			Num++;
			}
		System.out.println(Sum);
	}

}
