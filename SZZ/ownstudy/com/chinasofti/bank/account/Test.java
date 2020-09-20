package com.chinasofti.bank.account;

public class Test {

	public static void main(String[] args) {
		FlashDisk flash=new FlashDisk();
		HardDisk hard=new HardDisk();
		Mp3 mp3=new Mp3();
		SDCard cd=new SDCard();
		Computer computer=new Computer();
		computer.setMoibleSorage(flash);
		computer.readDate();
		computer.writeDate();
		computer.setMoibleSorage(hard);
        computer.readDate();
        computer.writeDate();
        computer.setMoibleSorage(cd);
        computer.readDate();
        computer.writeDate();
	}  

}
