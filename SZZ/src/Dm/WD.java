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
			System.out.printf("��%d�У����϶ȣ�%f,���϶ȣ�%f\n"
					, TM+1 , SSD, HSD);

		} while (TM <10 && SSD <= 250);
		System.out.println("���϶ȣ�" + SSD);
		System.out.println("���϶�" + HSD);
		System.out.println("��Ŀ" + TM);

	}

}
