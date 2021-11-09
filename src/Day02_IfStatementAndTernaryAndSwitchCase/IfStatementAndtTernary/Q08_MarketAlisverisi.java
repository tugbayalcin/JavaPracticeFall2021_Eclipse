package Day02_IfStatementAndTernaryAndSwitchCase.IfStatementAndtTernary;

import java.util.Scanner;

public class Q08_MarketAlisverisi {
	/*
	 * Problem tanimi : 
	 * 
	 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	 * musteri karti olup olmadigini sorun
	 * 
	 * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
	 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10 indirim yapin
	 */
	public static void main(String[] args) {
		
		// ben yaptim
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen kac adet urun aldiginizi yaziniz: ");
		int adet = scan.nextInt();
		System.out.println("Lutfen aldiginiz urunun birim fiyatini yaziniz: ");
		double fiyat = scan.nextDouble();
		
		System.out.println("Musteri kartiniz var mi? \nVarsa 1, yoksa 0 giriniz: ");
		int musteriKarti = scan.nextInt();
		
		double faturaTutari =0;
		double indirimTutari =0;
		
		if(musteriKarti ==1) 
		{
			if(adet>=10) 
			{
				faturaTutari = adet * (fiyat*(80.0/100));
				indirimTutari = adet * (fiyat*(20.0/100));
			}
			else
			{
				faturaTutari = adet * (fiyat*(75.0/100));
				indirimTutari = adet * (fiyat* (15.0/100));
			}		
		}
		else if(musteriKarti == 0) 
		{
			if(adet>=10) 
			{
				faturaTutari = adet * (fiyat*(75.0/100));
				indirimTutari = adet * (fiyat* (15.0/100));
			}
			else
			{
				faturaTutari = adet * (fiyat*(90.0/100));
				indirimTutari = adet * (fiyat* (10.0/100));
			}		
		}
		
		System.out.println(faturaTutari);
		System.out.println(indirimTutari);
		
		
		scan.close();

		
	}

}
