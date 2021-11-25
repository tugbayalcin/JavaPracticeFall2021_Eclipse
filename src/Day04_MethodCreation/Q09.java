package Day04_MethodCreation;

import java.util.Scanner;

	public class Q09 {
/*
    Problem Tanımı:
    addDigits isminde bir method oluşturun.
    Parametresi int
    Return tipi de int
    Pozitif int değerler ver ve en son sonuç tek basamaklı çıkana kadar basamakları birbiriyle topla.
    Tek basamaklı çıktığında, döndürün

    Örnek1:
    Girdi 38
    Çıktı: 2
    Açıklama: İşlemler şöyle olacak: 3 + 8 = 11, 1 + 1 = 2.
                 2 , tek basamaklı olduğundan, bunu döndürün.
    */

	 public static void main(String[] args) {
		 
		 Scanner scan = new Scanner(System.in);
	    
		 System.out.println("Lutfen Bir Sayi Giriniz: ");
	     int num = scan.nextInt(); 
	     // tek tek basamaklardaki elemanlari 10 a bolelim % yapalim diye ugrasmamak icin, string olarak alabilirdik
	     // string methodlariyle degerleri elde ederdik ancak parseInt bilmedigimiz icin vazgectik
	     
	     addDigits(num);
	     
	     scan.close();
	 }
	 
	 
	 
	 // methodlar
	 
	 private static int addDigits(int num) {
		 
		 nasil("kolay gelsinmethod calisti");
		 for(int i=0; i<5; i++) 
		 {
			 num = sum(num);
			
			 if(num<10) // sayi tek basamakli demek 
				 break;
		 }
		 return sum(num);
		 
	
	
}
	 private static void nasil(String mesaj) 
		{
			System.out.println("nasil methodu calisti:" + mesaj);
			
			gozunAydin("helal olsun bu method calisti, devam edelim");
		}
	 private static void gozunAydin(String goygoy) 
	 {
		 System.out.println("gozunAydin calisti:" + goygoy);
	 }
	 private static int sum(int num) {
	
		int toplam =0;
		int rakam =0;
		
		while(num>0) 
		{
			rakam = num%10;
			toplam+=rakam;
			num/=10;
		}
		System.out.println("Girilken Sayinin Rakamlar Toplami: " + toplam);
		return toplam;
	}

}
