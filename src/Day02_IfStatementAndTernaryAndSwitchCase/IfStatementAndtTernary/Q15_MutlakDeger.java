package Day02_IfStatementAndTernaryAndSwitchCase.IfStatementAndtTernary;

import java.util.Scanner;

public class Q15_MutlakDeger {

	public static void main(String[] args) {
		/*Kullanici tarafindan girilen bir sayinin
		 *mutlak degerini yazdirmak icin bir program yazin.
		 */

		// ben yaptim
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Bİr Sayi Giriniz: ");
		int sayi = scan.nextInt();
		int mutlakDeger = 0;
		
		if(sayi<0) 
		{
			mutlakDeger = -sayi;
		}
		else if(sayi>0)
		{
			mutlakDeger = sayi;
		}
		else if (sayi==0) 
		{
			mutlakDeger = 0;
		}
		System.out.println("Girdiginiz Sayinin Mutlak Degeri: "+mutlakDeger);
		
		
		scan.close();
		
		
		
		
	}

}
