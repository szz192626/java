package supermarket1;
import java.util.Scanner;
public class CK {
	public static void main(String[] args) {
		
		 double num=0,re;
		 int [][]arr1=new int[38][5]; 
		 int i = 1;
		      System.out.println("���          ��Ʒ          ����          ����          ��Ա��          �۸�");
		      System.out.printf("ʳƷ������     ����     ",i+1,"3.5Ԫ/ƿ","     3Ԫ/ƿ",     3.5*(i+1));
		      System.out.printf("ʳƷ������     ��Ȫˮ     ",i+1,"2Ԫ/ƿ","     1.8Ԫ/ƿ",     2*(i+1));
		      System.out.printf("ʳƷ������     Ҭ��֭     ",i+1,"8Ԫ/ƿ","     6Ԫ/ƿ",     8*(i+1));
		      System.out.printf("ʳƷ������     ţ��     ",i+1,"2Ԫ/ƿ","     1.8Ԫ/ƿ",     2*(i+1));
		      System.out.printf("ʳƷ����ʳ     ��Ƭ     ",i+1,"6Ԫ/ƿ","     5.5Ԫ/ƿ",     6*(i+1));
		      System.out.printf("ʳƷ����ʳ     ����     ",i+1,"5Ԫ/ƿ","     4.5Ԫ/ƿ",     5*(i+1));
		      System.out.printf("ʳƷ����ʳ     ����     ",i+1,"6Ԫ/ƿ","     5Ԫ/ƿ",     6*(i+1));
		      System.out.printf("ʳƷ����ʳ     ������     ",i+1,"8Ԫ/ƿ","     6Ԫ/ƿ",     8*(i+1));
		      System.out.printf("ʳƷ����ʳ     ����     ",i+1,"1.5Ԫ/ƿ","     1Ԫ/ƿ",     1.5*(i+1));
		      System.out.printf("ʳƷ����ʳ     С���     ",i+1,"2Ԫ/ƿ","     1.5Ԫ/ƿ",     2*(i+1));
		      System.out.printf("�߹����߲�     ���     ",i+1,"2Ԫ/��","     1.8Ԫ/��",     2*(i+1));
		      System.out.printf("�߹����߲�     �ܲ�     ",i+1,"1Ԫ/��","     0.8Ԫ/��",     1*(i+1));
		      System.out.printf("�߹����߲�     ���빽     ",i+1,"3Ԫ/��","     2.5Ԫ/��",     3*(i+1));
		      System.out.printf("�߹����߲�     ������     ",i+1,"4Ԫ/��","     3.5Ԫ/��",     4*(i+1));
		      System.out.printf("�߹���ˮ��     �㽶     ",i+1,"6Ԫ/��","     5.5Ԫ/��",     6*(i+1));
		      System.out.printf("�߹���ˮ��     ������     ",i+1,"8Ԫ/��","     7Ԫ/��",     8*(i+1));
		      System.out.printf("�߹���ˮ��     ƻ��     ",i+1,"16Ԫ/��","     15Ԫ/��",     16*(i+1));
		      System.out.printf("�߹���ˮ��     ��ݮ     ",i+1,"38Ԫ/��","     36Ԫ/��",     38*(i+1));
		      System.out.printf("�߹���ˮ��     �㽶     ",i+1,"6Ԫ/��","     5.5Ԫ/��",     6*(i+1));
		      System.out.printf("����������     ţ��     ",i+1,"50Ԫ/��","     48Ԫ/��",     50*(i+1));
		      System.out.printf("����������     ����     ",i+1,"50Ԫ/��","     48Ԫ/��",     50*(i+1));
		      System.out.printf("����������     ţ��     ",i+1,"50Ԫ/��","     48Ԫ/��",     50*(i+1));
		      System.out.printf("����������     ����     ",i+1,"60Ԫ/��","     55Ԫ/��",     60*(i+1));
		      System.out.printf("����������     ����     ",i+1,"50Ԫ/��","     48Ԫ/��",     50*(i+1));
		      System.out.printf("�����ຣ��     ��ΧϺ     ",i+1,"38Ԫ/��","     36Ԫ/��",     38*(i+1));
		      System.out.printf("�����ຣ��     ����     ",i+1,"26Ԫ/��","     25Ԫ/��",     26*(i+1));
		      System.out.printf("�����ຣ��     ������     ",i+1,"45Ԫ/��","     40Ԫ/��",     45*(i+1));
		      System.out.printf("������Ʒ��     �ͽ�ֽ     ",i+1,"15Ԫ/��","     13Ԫ/��",     15*(i+1));
		      System.out.printf("������Ʒ��     ë��     ",i+1,"8Ԫ/��","     6Ԫ/��",     8*(i+1));
		      System.out.printf("������Ʒ��     ��ˢ     ",i+1,"6Ԫ/��","     5Ԫ/��",     6*(i+1));
		      System.out.printf("������Ʒ��     �����     ",i+1,"25Ԫ/ƿ","     23Ԫ/ƿ",     25*(i+1));
		      System.out.printf("������Ʒ��     ϴ�ྫ     ",i+1,"25Ԫ/ƿ","     23Ԫ/ƿ",     25*(i+1));
		      System.out.printf("������     ����     ",i+1,"8000Ԫ/̨","     7999Ԫ/̨",     8000*(i+1));
		      System.out.printf("������     �յ�     ",i+1,"8000Ԫ/̨","     7500Ԫ/̨",     8000*(i+1));
		      System.out.printf("������     �����     ",i+1,"200Ԫ/��","     190Ԫ/��",     200*(i+1));
		      System.out.printf("������     ����     ",i+1,"300Ԫ/̨","     290Ԫ/̨",     300*(i+1));
		      System.out.printf("����     С�����ϴ�     ",i+1,"0.5Ԫ/��","     ",     0.5*(i+1));
		      System.out.printf("����     �к����ϴ�     ",i+1,"0.8Ԫ/��","     ",     0.8*(i+1));
		      System.out.printf("����     ������ϴ�     ",i+1,"1Ԫ/��","     ",     1*(i+1));
		      Scanner scan=new Scanner(System.in);
			    for(int j=0;j<num;j++) {
				   System.out.printf("",j+1);
//				   arr1[i][j]=scan.nextDouble();
			    }
		 }  	
		 }

