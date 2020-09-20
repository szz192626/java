package XH;

public class JTTL1 {

	public static void main(String[] args) {
		
		int J,T;
		
		for( J=0,T=35;J<=35&&T>=0;J++,T--) {
		  if(2*J+T*4==94) {
			break;
		}
		}System.out.println("鸡的数量："+J);
		System.out.println("兔的数量为："+T);
		
	}
}
