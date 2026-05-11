package com.bank.app.accounts;

import java.util.Random;

public class BankaHesabi {
	private String iban;
	private double bakiye;
	
	public BankaHesabi(double bakiye) {
		this.bakiye=bakiye;
		Random rand = new Random();
		this.iban = "TR" + String.valueOf(rand.nextInt(900000) + 100000);
	}
	
	public String toString() {
		return "Iban: " + iban + "   " + "Bakiye: " + bakiye ;
	}
	
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban=iban;
	}
	
	public double getBakiye() {
		return bakiye;
	}
	public void setBakiye(double bakiye) {
		this.bakiye=bakiye;
	}
	
	

}
