package Day02_IfStatementAndTernaryAndSwitchCase.IfStatementAndtTernary;

import java.util.Scanner;

public class Q03_VucutKitleIndeksi {

	public static void main(String[] args) {
		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy/100*boy/100)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */
		Scanner scan =new Scanner(System.in);
		
		System.out.print("boyunuzu giriniz ");
		double boy=scan.nextDouble();
		
		System.out.print("kilonuzu giriniz ");
		double kilo=scan.nextDouble();
		
		double vki=kilo/(boy/100*boy/100);
		
		if (vki<=20) {
			System.out.println("Oldukca zayifsiniz AGA boyle giderse zaafiyet gecirirsin");
		}
		else if (20<vki && vki<=25) {
			System.out.println("Normal sinirlardasiniz  AGA fitsin maasallah");
		}
		else if (25<vki && vki<=30) {
			System.out.println("Sisman kategorisindesiniz  AGA yenge saglam besliyor herhal");
		}
		else if (30<vki ) {
			System.out.println("Obez grubundasiniz. AGA mezarda kurtlar beslenecek");
		}
		
		
		// benim yalnizca if kismini modifiye ettigim 
		
		if (vki<=20) {
			System.out.println("Oldukca zayifsiniz AGA boyle giderse zaafiyet gecirirsin");
		}
		else if (vki<=25) {
			System.out.println("Normal sinirlardasiniz  AGA fitsin maasallah");
		}
		else if (vki<=30) {
			System.out.println("Sisman kategorisindesiniz  AGA yenge saglam besliyor herhal");
		}
		else if (30<vki ) {
			System.out.println("Obez grubundasiniz. AGA mezarda kurtlar beslenecek");
		}
		
		// gordugun uzere her ıkısı de aynı sonucu verdi, conbditiona aralik vermene gerek yok, zaten yazacagin ilk aralik bir ust satırda 
		// incelenmis ve oldurulmus oldugu icin su anki satira gelmis oluyorsun
		
		
		scan.close();
    }

}
