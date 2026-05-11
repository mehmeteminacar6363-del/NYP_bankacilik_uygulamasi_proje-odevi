package com.bank.app.people;

import java.util.ArrayList;
import java.util.Random;

public class BankaPersoneli extends Kisi {
	private String personelID;
	private ArrayList<Musteri> musteriler;
	
	public BankaPersoneli(String ad,String soyad,String email,String telefonNumarasi) {
		super(ad,soyad,email,telefonNumarasi);
		
		Random rand=new Random();
		this.personelID=String.valueOf(rand.nextInt(900000)+100000);
		this.musteriler=new ArrayList<>();
	}
			
	public String getPersonelID() {
		return personelID;
	}
	public void setPersonelID(String personelID) {
		this.personelID=personelID;
	}
	
	public ArrayList<Musteri> getMusteriler(){
		return musteriler;
	}
	public void setMusteriler(ArrayList<Musteri> musteriler) {
		this.musteriler=musteriler;
	}
	
	public String toString() {
		return "Personel ID: " + personelID + " " + super.toString();
	}
	
}
