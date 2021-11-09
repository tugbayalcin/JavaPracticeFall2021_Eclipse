package Day01_VariablesAndScanner.Homework.Scanner;

import java.util.Scanner;

public class Q07 {
	
	public static void main(String[] args) {
		/*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		
		 ORNEK:
		 
		 INPUT      : Kilo: 71
		              Boy: 1,72
		 OUTPUT     : Vucut Kitle Indeksiniz : 23
		 */
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen kilonuzu giriniz: ");
		int kilo = scan.nextInt();
		System.out.println("Lutfen boyunuzu giriniz: ");
		double boy = scan.nextDouble();
		
		
		int vki =(int)(kilo/(boy*boy));
		System.out.println("Vucut Kİtle Indeksiniz: " + vki);
		
		scan.close();

		
		
		
	}	
	

}
