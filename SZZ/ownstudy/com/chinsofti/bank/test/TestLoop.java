package com.chinsofti.bank.test;

public class TestLoop {

	public static void main(String[] args) {
	Loop1:	for(int j=1;j<4;j++) {
	Loop2:	for(int i=1;i<10;i++) {
			if(i%2==0) {
				
			//	�жϵ�ǰ��ѭ��
				break  Loop1;
			//���δָ����Ĭ��Ϊ�����ѭ������Loop2	
			//	�жε��ε�ѭ��,Ȼ�������һ��ѭ��
			//	continue;
				
				
			}
			
			System.out.println("i="+i);
		}
	}
	}

}
