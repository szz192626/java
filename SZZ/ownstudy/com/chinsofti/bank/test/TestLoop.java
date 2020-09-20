package com.chinsofti.bank.test;

public class TestLoop {

	public static void main(String[] args) {
	Loop1:	for(int j=1;j<4;j++) {
	Loop2:	for(int i=1;i<10;i++) {
			if(i%2==0) {
				
			//	中断当前的循环
				break  Loop1;
			//如果未指定，默认为最近的循环，即Loop2	
			//	中段当次的循环,然后继续下一次循环
			//	continue;
				
				
			}
			
			System.out.println("i="+i);
		}
	}
	}

}
