package supermarket1;

import java.util.Scanner;

public class Festivalscost {
	

	public void festivalscost (){
		Scanner scan = new Scanner(System.in);
		int secondNum=0;
		  
		do {
			 
		System.out.println("��������������������������������");
		System.out.println("ÿ����������Ʒ��˰���");
		System.out.println("�����ڼ����һ������");
		System.out.println("��ͯ��ѧϰ��Ʒ��������");
		System.out.println("��Ϧ���ɿ���������");
		System.out.println("�������Ʒһ�ɴ�����");
		System.out.println("˫ʮһ������Ʒ������");
		System.out.println("˫ʮ��������Ʒ������");
		System.out.println("��������������������������������");
		System.out.println("\t 1.ͣ��������");
		System.out.println("\t 0.������һ����");
		 secondNum =scan.nextInt();
		
		switch(secondNum) {
		case 1:
			Festivalscost fe=new Festivalscost();
			fe.festivalscost();
			break;
		case 0:
			System.out.println("�����ϼ��˵�");
		   break;
		
		  default:
			System.out.println("������0-1֮�����");
			
		}			
		}while(secondNum!=0);
		
	}
}


