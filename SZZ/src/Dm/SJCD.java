package Dm;

import java.util.Scanner;

public class SJCD {

	public static void main(String[] args) {
		boolean  flag=true;//    //false
		Scanner   scanner=new  Scanner(System.in);
		int i=0;
	    do { 
	    	flag=false;//��Ϊ�д���������ȷ֮��Ų�ѭ��//(��д��
			System.out.println("��ѡ��");
		System.out.println("\t  1.�ͻ�����");
		System.out.println("\t  2.�������");
		System.out.println("\t  3.�������");
		System.out.println("\t  4:ע��");
			i=scanner.nextInt();
			switch(i) {
			case 1:
			System.out.println("����");
			break;
			case 2:
				System.out.println("��Ǯ");
			break;
			case 3:
				System.out.println("��Ʒѡ��");
			break;
			case 4:
				System.out.println("�Ѿ�ע���˻�");
			break;
		default:
				System.out.println("����ò���");	
				flag=true;//��Ϊ�д������벻������²�ѭ��
			}
			}while(flag==true);
		}

}