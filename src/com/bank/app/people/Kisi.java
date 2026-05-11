package com.bank.app.people;

public class Kisi {
	
	private String ad;
	private String soyad;
	private String email;
	private String telefonNumarasi;
	
	public Kisi(String ad,String soyad,String email,String telefonNumarasi){
		this.ad=ad;
		this.soyad=soyad;
		this.email=email;
		this.telefonNumarasi=telefonNumarasi;
	}
	
	public String toString() {
		return ad + " " + soyad + " " + email + " " + telefonNumarasi;	
	}
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad=ad;
	}
	
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad=soyad;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	
	public  String getTelefonNumarasi() {
		return telefonNumarasi;
	}
	public void setTelefonNumarasi(String telefonNumarasi) {
		this.telefonNumarasi=telefonNumarasi;
	}
	
	
	
}
