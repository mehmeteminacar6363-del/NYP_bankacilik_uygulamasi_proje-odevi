# Banka Yönetim Sistemi - Nesneye Yönelik Programlama Proje Ödevi

Bu proje, **Bursa Teknik Üniversitesi** Bilgisayar Mühendisliği Bölümü **BLM0121 Nesneye Yönelik Programlama** dersi kapsamında geliştirilen bir bankacılık simülasyonudur. 
Proje, nesne yönelimli programlama (OOP) prensiplerine (Kalıtım, Kapsülleme, Polimorfizm) uygun olarak modüler bir yapıda inşa edilmiştir.

## 📌 Proje Özellikleri
* **Hiyerarşik Yapı:** `BankaPersoneli` ve `Musteri` sınıfları `Kisi` sınıfından; `VadesizHesap` ve `YatirimHesabi` sınıfları ise `BankaHesabi` temel sınıfından miras almaktadır.
* **Dinamik Veri Yönetimi:** Müşteri temsilcileri, hesaplar ve kredi kartları `ArrayList` yapıları kullanılarak dinamik bir şekilde yönetilir.
* **Otomatik Kimlik Üretimi:** Personel ID, Müşteri Numarası, Kart Numarası ve IBAN değerleri `Random` sayı üreticisi ile otomatik olarak oluşturulur.
* **İş Mantığı ve Kontroller:** * Hesap silme işlemi öncesinde bakiyenin 0 olması şartı aranır.
    * Kredi kartı silme işlemi öncesinde borcun tamamen ödenmiş olması (0 olması) kontrol edilir.
    * Hesaplar arası para transferi ve kredi kartı borç ödeme işlemleri desteklenmektedir.

## 📂 Paket Yapısı
Proje, dökümanda belirtilen zorunlu paket mimarisine uygun olarak tasarlanmıştır:
* `com.bank.app.people`: Kişi, Müşteri ve Banka Personeli sınıfları.
* `com.bank.app.accounts`: Banka Hesabı, Vadesiz Hesap ve Yatırım Hesabı sınıfları.
* `com.bank.app.cards`: Kredi Kartı sınıfı.
* `com.bank.app.service`: İş mantığını koordine eden `BankaService` sınıfı.
* `com.bank.app.main`: Uygulamanın giriş noktası olan `Main` sınıfı.

## 🚀 Çalıştırma Senaryosu
`Main` sınıfı içerisinde aşağıdaki işlemler test edilerek doğrulanmaktadır:
1.  Yeni bir müşteri kaydı oluşturma.
2.  Müşteri adına banka hesabı açma ve başlangıç bakiyesi yükleme.
3.  Vadesiz hesap üzerinden başka bir hesaba para transferi gerçekleştirme.
4.  Müşteriye kredi kartı tanımlama ve harcama/borç ödeme simülasyonu.
5.  Şartlar (0 bakiye/borç) sağlandığında hesap ve kart silme işlemlerinin testi.

## 🛠 Kullanılan Teknolojiler
* **Dil:** Java
* **Versiyon Kontrol:** Git & GitHub

## 📺 Video Sunumu
Projenin kod anlatımı ve çalışma senaryosunun yer aldığı videoya aşağıdaki bağlantıdan ulaşabilirsiniz:
[Buraya Tıklayarak Videoyu İzleyebilirsiniz (YouTube)](https://youtu.be/7t6rAzv3_NA)

## 👤 Hazırlayan
* **Ad Soyad:** [Mehmet Emin AÇAR]
* **Öğrenci No:** [25360859017]
* **Üniversite:** Bursa Teknik Üniversitesi
* **Ders:** BLM0121 Nesneye Yönelik Programlama

---
