package Day04_MethodCreation;

import java.util.Scanner;

public class Q03_BirimCevirici {
    public static void main(String[] args) {


// Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
        
      Scanner scan = new Scanner(System.in);
      System.out.println("Cevirilecek Birimi Giriniz: ");
      String birim = scan.next();
      
      System.out.println("Cevirilecek Birimin Degerini Giriniz: ");
      double miktar = scan.nextDouble();
      
      cevirici(birim,miktar);
    	
    	
      scan.close();
    }

	private static void cevirici(String birim, double miktar) {
		
		switch (birim) 
		{
		case "saat":
			System.out.println("Girilen Saatin Saniye Degeri: " + miktar*60*60 + " saniye");
			break;
		case "mil":
			System.out.println("Girilen Milin Kilometre Degeri: " + miktar*1.6 + " km");
			break;
		case "kg":
			System.out.println("Girilen Kilogramin Gram Degeri: " + miktar*1000 + " gram");
			break;
		default:
			System.out.println("Yanlis Deger Girdiniz. Lutfen Tekrar Deneyiniz!");
			break;
			
		}
		
	}
}

