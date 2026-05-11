package com.bank.app.cards;

import java.util.Random;

public class KrediKarti {
	private String kartNumarasi;
	private double limit;
	private double guncelBorc;
	private double kullanilabilirLimit ;
	
	public KrediKarti(double limit,double guncelBorc) {
		this.limit=limit;
		this.guncelBorc=guncelBorc;
		Random rand = new Random();
		this.kartNumarasi = String.valueOf(rand.nextInt(900000) + 100000);
	}
	
	public String toString() {
		return "Kart Numarasi: " + kartNumarasi + " Limit: " + limit + " Guncel Borc: " + guncelBorc + " Kullanilabilir Limit: " + kullanilabilirLimit;
		
	}
	
	
	public String getKartNumarasi() {
		return kartNumarasi;
	}
	public void setKartNumarasi(String kartNumarasi) {
		this.kartNumarasi=kartNumarasi;
	}
	
	public double getLimit() {
		return limit;
	}
	public void setLimit(double limit) {
		this.limit=limit;
	}
	
	public double getGuncelBorc() {
		return guncelBorc;
	}
	public void setGuncelBorc(double guncelBorc) {
		this.guncelBorc=guncelBorc;
	}
	
	public double getKullanilabilirLimit() {
		return kullanilabilirLimit;
	}
	public void setKullanilabilirLimit(double kullanilabilirLimit) {
		this.kullanilabilirLimit=kullanilabilirLimit;
	}

}
