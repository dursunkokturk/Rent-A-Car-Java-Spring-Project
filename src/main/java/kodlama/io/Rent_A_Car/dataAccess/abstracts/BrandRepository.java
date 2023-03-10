package kodlama.io.Rent_A_Car.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Rent_A_Car.entities.concretes.Brand;

// Marka Listeleme Islemini Yapmak Icin Interface Kullaniyoruz

// JpaRepository Kullanilarak Ekleme Silme Guncelleme Islemleri Icin 
// Kullanilacak Fonksiyonlar Otomatik Olarak Geliyor
// Bundan Dolayi DataAccess Katmani Altinda Concretes Katmani Altinda
// Ekleme Silme Guncelleme Fonksiyonlarinin 
// Islemlerini Barindiran Dosyaya Gerek Kalmiyor

// Interface Icinde Baska Bir Interface Icindeki Ozellikleri Kullanmak Istiyorsa
// Kullanmak Istedigi Interface i Extends Komutu Ile Baglayabiliriz

// JpaRepository deki 1. Parametre Database e Baglanti Icin Gereken Ozelliklerin Ve 
// Database Baglantisinin Yer Aldigi Class Adi

// JpaRepository deki 2. Parametre Database e Baglanti Icin Gereken Ozelliklerin Icindeki 
// id Bilgisini Class in Primary Key Degeri Olarak Kabul Ediyor

// Kabul Edilen Deger Tam Sayidir
public interface BrandRepository extends JpaRepository<Brand, Integer>{
	
	// Markanin Database Icinde Var Olma Durumunu Kontrol Etmek Icin 
	// Yeni Bir Method Olusturuyoruz
	// Yeni Method Icin JpaRepository Icinde Bulunan 
	// Ozel Keyword lerden Yararlaniyoruz
	boolean existsByName(String name);
	
	/*
	Find Ile Baslayan Bir Kyeword Kullanarak
	Tek Bir Yerde Kontrol Yapilacak Ise
	Brand findByName(String name);
	
	Find Ile Baslayan Bir Kyeword Kullanarak
	Bir Liste Icinde Kontrol Yapilacak Ise
	List<Brand> findByName(String name);
	*/
}