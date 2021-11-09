package Day01_VariablesAndScanner;

import java.util.Scanner;

public class Q_03 {

	public static void main(String[] args) {
		
		// Kullanicinin ad soyad yas boy kilosunu alt alta yazdiriniz
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Adiniz: ");
		String isim = scan.nextLine();
		
		System.out.println("Soyadiniz: ");
		String soyisim = scan.nextLine();
		
		System.out.println("Yasiniz: ");
		int yas = scan.nextInt();
		
		System.out.println("Boyunuz: ");
		int boy = scan.nextInt();
		
		System.out.println("Kilonuz: ");
		int kilo = scan.nextInt();
		
		System.out.println("Benim adim: "+isim +"\n"
		+"Soyadim: "+ soyisim +"\n"
		+"Yasim: "+ yas +"\n"
		+"Boyum: "+ boy +"\n"
		+"Kilom: "+ kilo);
		
		scan.close();
		
	}

}
