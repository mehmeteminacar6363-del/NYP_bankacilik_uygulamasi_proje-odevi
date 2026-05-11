package com.bank.app.service;

import java.util.ArrayList;
import com.bank.app.people.Musteri;

//Banka iş mantığını yöneten sınıf
public class BankaService {
	
private ArrayList<Musteri> musteriler;
    
    // Constructor
    public BankaService() {
        this.musteriler = new ArrayList<>();
    }
    
    // Müşteri ekleyen fonksiyon
    public void musteriEkle(Musteri musteri) {
        musteriler.add(musteri);
    }
    
    // Müşteri silen fonksiyon
    public void musteriSil(Musteri musteri) {
        musteriler.remove(musteri);
    }
    
    // Tüm müşterileri döndüren fonksiyon
    public ArrayList<Musteri> getMusteriler() {
        return musteriler;
    }
    
    // Tüm müşterileri ekrana yazdıran fonksiyonu
    public void musterileriYazdir() {
        for (Musteri m : musteriler) {
            System.out.println(m.toString());
        }
    }
}


