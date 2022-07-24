
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IndividualCustomers dursun = new IndividualCustomers();
		dursun.id = 1;
		dursun.customerFirstName = "Dursun";
		dursun.customerLastName = "K�kt�rk";
		dursun.customerNumber = "12345";
		
		// Bireysel Musteri Objesi Olusturuyoruz
		// Olusturulan Objenin Atandigi Degisken Uzerinden 
		// Bireysel Musteri Icindeki Ozelliklere Ulasiyoruz Ve Deger Gonderiyoruz
		CorporateCustomers hepsiburada = new CorporateCustomers();
		hepsiburada.id = 1;
		hepsiburada.companyName = "Hepsi Burada";
		hepsiburada.customerNumber = "6789";
		
		// Bireysel Musteri Objesi Olusturuyoruz
		// Olusturulan Objenin Atandigi Degisken Uzerinden 
		// Bireysel Musteri Icindeki Ozelliklere Ulasiyoruz Ve Deger Gonderiyoruz
		UnionCustomers engineerUnion = new UnionCustomers();
		engineerUnion.customerNumber = "3242134";
		
		CustomersManager customerManager = new CustomersManager();
		
		// Tum Musteri Turlerini Ayni Anda Yazdirmak Icin Array Mantigini Kullaniyoruz
		Customers[] customers = {dursun,hepsiburada,engineerUnion};
		
		// CustomersManager Objesinin Atandigi Degisken Uzerinden
		// AddMultiple Fonksiyonuna Ulasiyoruz
		// Fonksiyona Array Degerlerinin Atandigi Degisken Adini Parametre Olarak Veriyoruz
		// Bu Sekilde Tum Musteri T�rlerini Tek Seferde Yazdiriyoruz
		System.out.println("T�m M��teri T�rlerinin Tek Seferde Yaz�lm�� Hali");
		customerManager.addMultiple(customers);
		
		// CustomersManager Objesinin Atandigi Degisken Uzerinden
		// AddMultiple Fonksiyonuna Ulasiyoruz
		// Fonksiyona Array Degerlerinin Atandigi Degisken Adini Parametre Olarak Veriyoruz
		// Bu Sekilde Tum Musteri T�rlerini Tek Seferde Yazdiriyoruz
		System.out.println("T�m M��teri T�rlerinin Tek Tek Yaz�lm�� Hali");
		customerManager.add(dursun);
		customerManager.add(hepsiburada);
		customerManager.add(engineerUnion);

	}
}