package com.chinasofti.bank.account;

public class Computer {
private MoibleSorage Sorage;

public void setMoibleSorage(MoibleSorage Sorage) {
	this.Sorage = Sorage;
}
public void readDate() {
	Sorage.read();
}
	public void writeDate() {
	Sorage.write();	
	}
	
}
