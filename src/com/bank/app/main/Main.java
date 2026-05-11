package com.bank.app.main;

import com.bank.app.people.Musteri;
import com.bank.app.people.BankaPersoneli;
import com.bank.app.accounts.BankaHesabi;
import com.bank.app.accounts.VadesizHesap;
import com.bank.app.accounts.YatirimHesabi;
import com.bank.app.cards.KrediKarti;
import com.bank.app.service.BankaService;

public class Main {

	public static void main(String[] args) {
		
		 // BankaService oluştururduğumuz kısım
        BankaService bankaService = new BankaService();
        
        // Müşterileri oluşturduğumuz kısım
        Musteri musteri1 = new Musteri("Ali", "Yılmaz", "ali@gmail.com", "5551234567");
        bankaService.musteriEkle(musteri1);
        System.out.println("Müşteri oluşturuldu: " + musteri1.toString());
        
        // Müşteri adına vadesiz hesap açıyoruz
        musteri1.hesapEkle("Vadesiz");
        System.out.println("Vadesiz hesap açıldı.");
        
        // Müşteri adına yatırım hesabı açıyoruz
        musteri1.hesapEkle("Yatirim");
        System.out.println("Yatırım hesabı açıldı.");
        
        // Vadesiz hesaba para yatırıyoruz
        VadesizHesap vadesizHesap = (VadesizHesap) musteri1.getHesaplar().get(0);
        vadesizHesap.paraEkle(1000);
        System.out.println("Vadesiz hesaba 1000 TL yatırıldı. " + vadesizHesap.toString());
        
        // Hesaplar arasında para transferi yapılan kısım
        YatirimHesabi yatirimHesap = (YatirimHesabi) musteri1.getHesaplar().get(1);
        vadesizHesap.paraTransferi(yatirimHesap, vadesizHesap, 500);
        System.out.println("500 TL transfer yapıldı.");
        System.out.println("Vadesiz hesap: " + vadesizHesap.toString());
        System.out.println("Yatırım hesabı: " + yatirimHesap.toString());
        
        // Müşteriye kredi kartı tanımlıyoruz
        musteri1.krediKartiEkle(5000);
        KrediKarti kart = musteri1.getKrediKartlari().get(0);
        System.out.println("Kredi kartı tanımlandı: " + kart.toString());
        
        // Kredi kartı borcu ödeme işlemi önce borç ekliyoruz sonra da borcu ödüyoruz
        kart.setGuncelBorc(200);
        vadesizHesap.krediKartiBorcOdeme(kart, 200);
        System.out.println("200 TL borç ödendi. Kart: " + kart.toString());
        
        // Bakiyesi olan hesabı silmeye çalışıyoruz
        System.out.println("\n-- Bakiyesi olan hesabı silme denemesi --");
        BankaHesabi silinecekHesap = musteri1.getHesaplar().get(1);
        musteri1.hesapSil(silinecekHesap);
        
     // Yatırım hesabının bakiyesini sıfırlayıp siliyoruz
        yatirimHesap.setBakiye(0);
        musteri1.hesapSil(yatirimHesap);
        
     // Borcu olan kredi kartını silmeye çalışıyoruz (uyarı vermeli)
        System.out.println("\n-- Borcu olan kartı silme denemesi --");
        kart.setGuncelBorc(100);
        musteri1.krediKartiSil(kart);
        
     // Borç sıfırlanıp kart siliniyor
        kart.setGuncelBorc(0);
        musteri1.krediKartiSil(kart);
        
        
        // Banka personeli oluştur
        BankaPersoneli personel = new BankaPersoneli("Ayşe", "Kaya", "ayse@banka.com", "5559876543");
        System.out.println("Personel oluşturuldu: " + personel.toString());
    }
		

}


