package Day01_VariablesAndScanner.Homework.Scanner;

import java.util.Scanner;

public class Q09 {
	
	public static void main(String[] args) {

	    /*  Problem Tanımı
	        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
	        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz nin karesi
	        Örnek Ekran Çıktısı
	        a sayısını giriniz: 5
	        b sayısını giriniz: 3
	        c sayısını giriniz: 1
	        sonuç : 5.333333333333333
	        */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen a sayisini giriniz: ");
		int a = scan.nextInt();
		System.out.println("Lutfen b sayisini giriniz: ");
		int b = scan.nextInt();
		System.out.println("Lutfen c sayisini giriniz: ");
		int c = scan.nextInt();
		
		double sonuc = (((a*a) - (b*b)) / (double)(3*c));
		System.out.println("sonuc: " + sonuc);
		
		scan.close();


	    }

}
