package Day02_IfStatementAndTernaryAndSwitchCase.IfStatementAndtTernary;

import java.util.Scanner;

public class Q05_KanBagisi {

	public static void main(String[] args) {
		// Kullanicidan  yasini ve kilosunu alaliniz
		// 18 yasindan kucuk ise kan bagisi yapamaz
		// 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		// 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Yasinizi Giriniz:");
		int yas = scan.nextInt();
		System.out.println("Lutfen Kilonuzu Giriniz:");
		int kilo = scan.nextInt();
		
		if(yas<18) 
		{
			System.out.println("Kan Bagisi Yapamazsiniz");
		}
		else 
		{
			if(kilo<50) 
			{
				System.out.println("Kan Bagisi Yapamazsiniz");
			}
			else 
			{
				System.out.println("Kan Bagisi Yapabilirsiniz");
			}
		}
		
		
		scan.close();

	}

}
