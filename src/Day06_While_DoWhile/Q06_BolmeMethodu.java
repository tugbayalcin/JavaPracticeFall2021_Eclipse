package Day06_While_DoWhile;

import java.util.Scanner;

public class Q06_BolmeMethodu {
	
	static int bolum=0;

	public static void main(String[] args) {
		
		// kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru 
		// kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bolunen sayiyi giriniz: ");
		int bolunen = scan.nextInt();
		
		System.out.println("Lutfen bolen sayiyi giriniz: ");
		int bolen = scan.nextInt();
		
		System.out.println(bolmeMethodu(bolunen, bolen));
		
		scan.close();
	}

	public static int bolmeMethodu(int bolunen, int bolen) {
		
		while(bolunen>=bolen) 
		{
			bolunen -= bolen;
			bolum ++;
		}
		return bolum;
		
	}
	

}
