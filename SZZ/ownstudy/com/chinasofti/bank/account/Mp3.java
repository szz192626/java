package com.chinasofti.bank.account;

public class Mp3 implements MoibleSorage,Player{

	@Override
	public void play() {
		System.out.println("Mp3²¥·ÅÒôÀÖ");
		
	}

	@Override
	public void stop() {
		System.out.println("Mp3Í£Ö¹²¥·ÅÒôÀÖ");
		
	}

	@Override
	public void read() {
		System.out.println("Mp3¶ÁÈ¡ÒôÀÖ...");
		
	}

	@Override
	public void write() {
		System.out.println("Mp3Ğ´Ğ´³öÊı¾İ...");
		
	}
 
}
