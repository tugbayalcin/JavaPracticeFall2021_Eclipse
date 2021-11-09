package Day02_IfStatementAndTernaryAndSwitchCase.IfStatementAndtTernary;

import java.util.Scanner;

public class Q07_BuyukKucukHarf {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada 
		hatali giris seklinde kod yazniz
		 */
		
		// ben cozdum
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir harf giriniz: ");
		char harf = scan.next().charAt(0);
		
		
		if(harf >= 65 && harf <= 90) 
		{
			System.out.println("Girilen Harf Buyuk Harftir.");
		}
		else if(harf >=97 && harf <= 122)
		{
			System.out.println("Girilen Harf Kucuk Harftir.");
		}
		else 
		{
			System.out.println("Hatali Giris Yaptiniz. Lutfen Tekrar Deneyiniz: ");
		}
		scan.close();
		
		

	}

}
