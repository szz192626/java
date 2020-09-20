package Dm;

public class WD {

	public static void main(String[] args) {
		double SSD = 0;
		int TM = 0;
		double HSD = 0;
		do {
			HSD=SSD*9/5.0+32;
			SSD =SSD+20;
			++TM;
			System.out.printf("第%d行，摄氏度：%f,华氏度：%f\n"
					, TM+1 , SSD, HSD);

		} while (TM <10 && SSD <= 250);
		System.out.println("摄氏度：" + SSD);
		System.out.println("华氏度" + HSD);
		System.out.println("条目" + TM);

	}

}
