package exception;

import java.util.Scanner;

import XH.exescise;

public class TestThrowSelfException {
	public static double divide() throws NotZeroSelfException{
		Scanner in = new Scanner(System.in);
		System.out.print("�����뱻����:");
		int num1 = in.nextInt();
	    System.out.print("���������:");
	    int num2 = in.nextInt();
	    if(num2==0){
	    	NotZeroSelfException nzsx=new NotZeroSelfException("�����Լ�����������쳣");
	        nzsx.setDevidedNum(num1);
	        throw nzsx;
		}
	    
		return (double)num1/num2;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{		
			divide();
		}catch(NotZeroSelfException e) {
		System.out.println("���󣬲�����");
		System.out.println();
		e.getStackTrace();
		}finally{
			System.out.println("�����̵Ĺ��̵������");		
		}
	}
}