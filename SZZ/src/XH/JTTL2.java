package XH;

public class JTTL2 {

	public static void main(String[] args) {
		int j,t;
		for(j=0;j<=35;j++) {
			t=35-j;
			if(j*2+t*4==94) {
				System.out.printf("鸡有%d只，兔有%d只.",j,t);
				break;	
			}
		}
	}

}
