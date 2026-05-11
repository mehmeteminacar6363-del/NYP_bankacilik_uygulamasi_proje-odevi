package com.bank.app.people;
import java.util.ArrayList;
import java.util.Random;
import com.bank.app.accounts.BankaHesabi;
import com.bank.app.accounts.VadesizHesap;
import com.bank.app.accounts.YatirimHesabi;
import com.bank.app.cards.KrediKarti;
public class Musteri extends Kisi{
	private String musteriNumarasi;
	private ArrayList<BankaHesabi> hesaplar;
	private ArrayList<KrediKarti> krediKartlari;
	public Musteri(String ad,String soyad,String email,String telefonNumarasi) {
		//kişi sınıfında zaten buna uygun bir metod olduğundan super ile onu çağırıyoruz
		super(ad,soyad,email,telefonNumarasi);
		//müşteri numarasını randomla oluşturuyoruz
		Random rand=new Random();
		this.musteriNumarasi= String.valueOf(rand.nextInt(900000)+100000);
		
		this.hesaplar = new ArrayList<>();
		this.krediKartlari = new ArrayList<>();
	}
	public void hesapEkle(String hesapTuru) {
		if(hesapTuru.equals("Vadesiz")){
			VadesizHesap yeniHesap =new VadesizHesap(0);
			hesaplar.add(yeniHesap);
			}
		else if(hesapTuru.equals("Yatirim")) {
			YatirimHesabi yeniHesap=new YatirimHesabi(0);
			hesaplar.add(yeniHesap);
		}	
	}
	public void krediKartiEkle(double limit) {
		KrediKarti yeniKart=new KrediKarti(limit,0);
		krediKartlari.add(yeniKart);	
	}
	public void hesapSil(BankaHesabi hesap) {
		if(hesap.getBakiye()>0) {
			System.out.println("Lütfen öncelikle bakiyenizi başka bir hesaba aktarınız");
		}
		else if(hesap.getBakiye()==0) {
			hesaplar.remove(hesap);
			System.out.println("Yatırım hesabı silindi.");
		}
	}
	public void krediKartiSil(KrediKarti kart) {
		if(kart.getGuncelBorc()>0) {
			System.out.println("Lütfen öncelikle borç ödemesi yapınız");
		}
		else {
			krediKartlari.remove(kart);
			System.out.println("Kredi kartı silindi.");
		}
	}
	public String toString() {
		return "Musteri No: " + musteriNumarasi + " " + super.toString();
	}
	
	public String getMusteriNumarasi() { 
		return musteriNumarasi; 
		}
	public void setMusteriNumarasi(String musteriNumarasi) { 
		this.musteriNumarasi = musteriNumarasi; 
		}

	public ArrayList<BankaHesabi> getHesaplar() { 
		return hesaplar; 
		}
	public void setHesaplar(ArrayList<BankaHesabi> hesaplar) { 
		this.hesaplar = hesaplar; 
		}

	public ArrayList<KrediKarti> getKrediKartlari() { 
		return krediKartlari; 
		}
	public void setKrediKartlari(ArrayList<KrediKarti> krediKartlari) { 
		this.krediKartlari = krediKartlari; 
		}
	
	
	
}
