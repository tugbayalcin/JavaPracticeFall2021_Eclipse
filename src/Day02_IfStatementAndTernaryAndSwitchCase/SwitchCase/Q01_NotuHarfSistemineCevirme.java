package Day02_IfStatementAndTernaryAndSwitchCase.SwitchCase;

import java.util.Scanner;

public class Q01_NotuHarfSistemineCevirme {

	public static void main(String[] args) {
		// Kullanıcıdan notunu alın ve aşağıdaki kurallara göre ekrana A, B, C veya D yazdırın.
		// 1. 0()dahil ile 50 arasi - D   
		// 2. 50(dahil) ile 60 arası - C   
		// 3. 60(dahil) ile 80 arası - B  
		// 4. 80(dahil) ustu- A
		// Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
		// switch() kullanarak yapiniz.
		
		// switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		// switch() de int, byte, short, char, String kullanilir.
		
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen notunuzu giriniz: ");
		int not = scan.nextInt();
		int durum = not/10;
		
		// birinci yol ------------------------- Udemyde de gordun bu cozumu, emre de algorithmmasini yazdi !!!
		switch (durum) 
		{
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("D");
				break;
			case 5:
				System.out.println("C");
				break;
			case 6:
			case 7:
				System.out.println("B");
				break;
			case 8:
			case 9:
			case 10:
				System.out.println("A");
				break;	
			default:
				System.out.println("Lutfen gecerli bir not giriniz.");
				break;
		}
		
		// ikinci yol ---------------------------------- switch icerisinde ternary ile degerlendirme yapailirsin
		
		switch ( // ternaryi icice kumeler  gibi dusunme, sira-kuyruk gibi dusun
				(0<= not && not <=49 ) ? 1 :  //sart saglanirsa 1 yaz, yoksa allttaki sarta gec
			    (50<=not && not <=59 ) ? 2 : 
			    (60<=not && not <=79 ) ? 3 :
			    (80<=not && not <=100) ? 4 : 5 // 5 yerine null koyarsan compile-time hata almayiz ama null demek kiyas yok demek, mantik hatasi
	    		)							   // ve runtimeda nullpointerException hatasi aliriz
		{
			case 1:
				System.out.println("D");
				break;
			case 2:
				System.out.println("C");
				break;
			case 3:
				System.out.println("B");
				break;
			case 4: //  bu satirdan sonra case 5 yazmayip direk default da yazabiliriz, ayni sonucu verir
				System.out.println("A");
				break;	
			case 5: //0-100 arasi disindaki tum degerler 5 te calisir ancak komut ve break olmadigi icin hicbir sey yapmadan bir sonraki satir olan default satirindan calismaya devam eder 
			// break;    koyarsak switch'i bitir, switchten cikar dolayisiyla default satiri calismaz
				default : 
					System.out.println("Lutfen gecerli bir not giriniz.");
					break;
		
		}
	
		
		
		
		scan.close();
	}
}
