package Day01_VariablesAndScanner.Homework.Scanner;

import java.util.Scanner;

public class Q05 {
	
	public static void main(String[] args) {

	    /*  Problem Tanımı
	        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.
	        Örnek Ekran Çıktısı
	        birinci kenar: 12
	        ikinci kenar: 5
	        hipotenus: 13      
	        
	    */

			Scanner scan = new Scanner(System.in);
			System.out.println("Dik ucgenin birinci kenarini giriniz: ");
			int birinciKenar = scan.nextInt();
			System.out.println("Dik ucgenin ikinci kenarini giriniz: ");
			int ikinciKenar = scan.nextInt();
			
			double hipotenus = Math.sqrt(((birinciKenar*birinciKenar) + (ikinciKenar*ikinciKenar)));
			System.out.println("Hipotenus: "+hipotenus);

			scan.close();

	    }

}
