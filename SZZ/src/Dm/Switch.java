package Dm;

import java.util.Scanner;

public  class  Switch{

	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  System.out.println("���������Σ����֣���"); 
		String str=scan.next();
     switch(str) {
		case  "һ":
			System.out.println("������ŷ����һȦ");
		   break;
		case "��":
			System.out.println("���������ھ����漸��");
			break;
		case "��":
			System.out.println("�ʼǱ�����һ̨");
		  break;
		  default:
		System.out.println("Ŭ��");
			break;
		}
	}
}
