package exception;

import java.util.Scanner;

import XH.exescise;

public class TestThrowSelfException {
	public static double divide() throws NotZeroSelfException{
		Scanner in = new Scanner(System.in);
		System.out.print("请输入被除数:");
		int num1 = in.nextInt();
	    System.out.print("请输入除数:");
	    int num2 = in.nextInt();
	    if(num2==0){
	    	NotZeroSelfException nzsx=new NotZeroSelfException("我们自己定义的有名异常");
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
		System.out.println("错误，捕获了");
		System.out.println();
		e.getStackTrace();
		}finally{
			System.out.println("计算商的过程到此完成");		
		}
	}
}