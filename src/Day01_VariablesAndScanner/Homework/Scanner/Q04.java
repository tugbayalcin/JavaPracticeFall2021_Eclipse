package Day01_VariablesAndScanner.Homework.Scanner;

import java.util.Scanner;

public class Q04 {
	
public static void main(String[] args) {
		
		/*
		 *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
		 *  
		 *   Ex :
		 *   input  : 12345
		 *   output : 12
		 */
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Lutfen 5 basamakli bir sayi giriniz: ");
	int sayi = scan.nextInt();
	
	int birlerBasamagi = sayi%10;
	int onlarBasamagi = (sayi/10)%10;
	int binlerBasamagi = (sayi/1000)%10;
	int onbinlerBasamagi = sayi/10000;
	
	int toplam = birlerBasamagi + onlarBasamagi + binlerBasamagi + onbinlerBasamagi;
	
	System.out.println("Girdiginiz sayinin ilk iki ve son iki basamagindaki rakamlarin toplami: "+ toplam);
		
		scan.close();
		

	}

}
