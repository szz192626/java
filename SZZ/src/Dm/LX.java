package Dm;

import java.util.Scanner;

public class LX { 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���������ڼ���");
		System.out.println("\t  a:����һ��������");
		System.out.println("\t  b:���ڶ����������������塢������");
		System.out.println("\t  c:������");
		String str = scan.next();
		switch (str) {
		case "a":
			System.out.println("ѧϰjava");
			break;
		case "b":
			System.out.println("��ѡ�����ݣ�");
			System.out.println("\t  d:��ѧϰӢ��");
			System.out.println("\t  e:��ѧϰ��ѧ");
			String ste = scan.next();
			switch (ste) {
			case "d":
				System.out.println("��ϰ����");
				break;
			case "e":
				System.out.println("ѧϰ΢����");
				break;
			}
			
		case "c":
			System.out.println("��Ϣ");
			break;
		default:
			break;
		}
	}
}
