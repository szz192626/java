package com.chinasofti.bank.account;

public class Mp3 implements MoibleSorage,Player{

	@Override
	public void play() {
		System.out.println("Mp3��������");
		
	}

	@Override
	public void stop() {
		System.out.println("Mp3ֹͣ��������");
		
	}

	@Override
	public void read() {
		System.out.println("Mp3��ȡ����...");
		
	}

	@Override
	public void write() {
		System.out.println("Mp3дд������...");
		
	}
 
}
