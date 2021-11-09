package Day01_VariablesAndScanner;

import java.util.Scanner;

public class Q_04 {

	public static void main(String[] args) {
		
		// Kullanicidan 2 tam sayi alip bu 2 tamsayinin dort islem sonucunu yazdiriniz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Birinci Sayiyi Giriniz: ");
		int sayi1 = scan.nextInt();
		System.out.println("Lutfen Ikinci Sayiyi Giriniz: ");
		int sayi2 = scan.nextInt();
		
		System.out.println("Girilen sayilarin toplami: " + (sayi1+sayi2) + "\n" 
		+ "Girilen sayilarin farki: " + (sayi1-sayi2) + "\n" 
		+"Girilen sayilarin carpimi: " + (sayi1*sayi2) + "\n" 
		+"Girilen sayilarin bolumu: " + (sayi1/sayi2));
		
		scan.close();

	}

}
