package Day01_VariablesAndScanner.Homework.Scanner;

import java.util.Scanner;

public class Q06 {
	
	public static void main(String[] args) {

	    /*  Problem Tanımı
	        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
	        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
	        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?
	        Örnek Ekran Çıktısı
	        Mesafeyi giriniz: 400
	        Hızı giriniz: 100
	        Süre 4 saattir.
	        
	        Note: Yol = hiz x zaman
	     */

		Scanner scan = new Scanner(System.in);
		System.out.println("Iki sehir arasindaki mesafeyi km cinsinden giriniz: ");
		int yol = scan.nextInt();
		System.out.println("Aracin hizini km/s cinsinden giriniz: ");
		int hiz = scan.nextInt();
		
		double zaman = yol/hiz;
		System.out.println("Sure " +zaman+ " saattir.");

		scan.close();
		
		


	    }

}
