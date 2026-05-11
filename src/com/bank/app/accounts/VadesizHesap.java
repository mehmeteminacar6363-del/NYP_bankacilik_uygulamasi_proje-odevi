package com.bank.app.accounts;

import com.bank.app.cards.KrediKarti;

// VadesizHesap sınıfı BankaHesabi sınıfının  mirasçısı
public class VadesizHesap extends BankaHesabi {
	
	private String hesapTuru;
	
	
	public VadesizHesap(double bakiye){
		super(bakiye);
		this.hesapTuru="Vadesiz";
	}
	
	public void paraEkle(double miktar) {
	    setBakiye(getBakiye() + miktar);
	}
	
	public String getHesapTuru() {
		return hesapTuru;
	}
	public void setHesapTuru(String hesapTuru) {
		this.hesapTuru=hesapTuru;
	}
	//hesaplar arası para transferi
	public void paraTransferi(BankaHesabi aliciHesap,BankaHesabi gonderenHesap,double miktar) {
		gonderenHesap.setBakiye(gonderenHesap.getBakiye() - miktar);
        aliciHesap.setBakiye(aliciHesap.getBakiye() + miktar);
	}
	//kredi kartının borcunu ödeme metodu
	public void krediKartiBorcOdeme(KrediKarti kart,double miktar) {
		this.setBakiye(this.getBakiye() - miktar);
        kart.setGuncelBorc(kart.getGuncelBorc() - miktar);
	}
	
	public String toString() {
        return "Hesap Turu: " + hesapTuru + " " + super.toString();
    }

	
	

}
