package Day06_While_DoWhile;

import java.util.Scanner;

public class Q10_EnBuyukSayi {

	public static void main(String[] args) {
		
		 // Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.
		
		Scanner scan = new Scanner(System.in);
		
		
		
		int enBuyukSayi =0;
		int count =0;
		
		while(count<5) 
		{
			System.out.println("Lutfen bir sayi giriniz.");
			int sayi = scan.nextInt();
			
			if(sayi>enBuyukSayi) 
			{
				enBuyukSayi = sayi;
			}
			count ++;
		}
		System.out.println("En Buyuk Sayi: " + enBuyukSayi);
		
		
		scan.close();
	}

}
