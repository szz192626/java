package FF;

public class ArrDin {

	public static void main(String[] args) {
		//ֱ�Ӹ�ֵ
		double [][]   scores={
			{12,40.5,90},
			{1,2,5.0},
			{98,60,52},
			{5,20,90  }};
		//�ڶ��������ʼ��
		scores= new double[5][3];
		scores[0][1]=56.0;
		//�����ֳ�ʼ������
		scores=new double[10][];
		scores[0]=new double[3];
		scores[0][2]=90;
		
		//�������һ��3����4
		for(int i=0;i<scores.length;i++) {
		int rd=(int)(2*Math.random()+3);
		System.out.println(rd);
		scores[i]=new double[rd];
		}
		
		
		
		
		
		

	}

}
