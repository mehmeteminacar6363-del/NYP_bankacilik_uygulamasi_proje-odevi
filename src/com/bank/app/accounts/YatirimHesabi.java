package com.bank.app.accounts;

public class YatirimHesabi extends BankaHesabi {
	private String hesapTuru;
	
	public YatirimHesabi(double bakiye) {
	super(bakiye);
	hesapTuru="Yatirim";
	}
	
	public void paraEkle(double miktar) {
		setBakiye(getBakiye()+miktar);
	}
	
	public void paraCek(double miktar) {
		setBakiye(getBakiye()-miktar);
	}
	
	public String getHesapTuru() {
		return  hesapTuru;
	}
	public void setHesapTuru(String hesapTuru) {
		this.hesapTuru=hesapTuru;
	}
	
	public String toString() {
		return "HesapTuru: " + hesapTuru + " " + super.toString();
	}

}
