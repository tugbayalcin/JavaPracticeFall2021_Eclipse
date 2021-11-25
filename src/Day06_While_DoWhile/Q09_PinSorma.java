package Day06_While_DoWhile;

import java.util.Scanner;

public class Q09_PinSorma {

	public static void main(String[] args) {
		
	//  kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen PİN'inizi giriniz: ");
		int userPin = scan.nextInt();
		
		int systemPin = 1453;
		
		while(userPin != systemPin) 
		{
			System.out.println("Hatali Pin Girdiniz. \nLutfen tekrar deneyiniz.");
			userPin=scan.nextInt();
		}
		System.out.println("Giriş Başarili");
		
		
		scan.close();

	}

}
