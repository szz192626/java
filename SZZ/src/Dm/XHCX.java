package Dm;

import java.util.Scanner;

public class XHCX {

	public static void main(String[] args) {
		Scanner  scan=new  Scanner(System.in);
		int  productNo=0;
	  String  str="y";
	
	while(str.equals("y")) {
		System.out.println("��������Ʒ��ţ�");
	
		productNo=scan.nextInt();
		switch(productNo) {
		case 1:
			System.out.println("ƻ���ļ۸�Ϊ5Ԫÿ��");
			break;
		case 2:
			System.out.println("�㽶�ļ۸�Ϊ3Ԫÿ��");
			break;
		case 3:
		System.out.println("���ӵļ۸�Ϊ4Ԫÿ��");
			break;
		default:
			System.out.println("���޴���Ʒ");
		}
		System.out.println("��Ҫ�ٴβ�ѯ�� y:��  N:��");
		  str=scan.next();
	}

	}

}
