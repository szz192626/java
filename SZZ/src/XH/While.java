package XH;

public class While {

	public static void main(String[] args) {
		double  Num=0,BS=1;
        double   Sum=0;
       while(Num>=0&&Num<=50) {
    	   Sum=Num+Sum;
			Num=7*BS;
			BS++;
			}
		System.out.println("1��50����7�ı����ĺ�Ϊ"+Sum);
		}

}
