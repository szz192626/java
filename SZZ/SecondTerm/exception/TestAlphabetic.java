package exception;

import java.util.Scanner;

public class TestAlphabetic {

	public static void main(String[] args) {
		Scanner  scan=new Scanner(System.in);
		System.out.println("���������֣�");
		try {
		int charAt=scan.nextInt();
		String a="cmydbz";
		for(int i=0;i<=a.length();i++) {
			System.out.println(a.charAt(i));
		}
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("��⵽�ַ���Խ���쳣���ѱ�����");
		}catch(Exception e) {
			System.out.println("��⵽�쳣���ѱ�����");
		}finally {
			System.out.println("��ֹ");
		}System.out.println("���������������ллʹ��");
	}
	}
