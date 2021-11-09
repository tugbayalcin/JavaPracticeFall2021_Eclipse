package Day01_VariablesAndScanner.Homework.Scanner;

import java.util.Scanner;

public class Q11 {
	
	 public static void main(String[] args) {
	        /*
	        TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
	        bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.
	         */
		 
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Lutfen adinizi giriniz: ");
		 String isim = scan.nextLine();
		 System.out.println("Lutfen soyadinizi giriniz: ");
		 String soyisim = scan.nextLine();
		 System.out.println("Lutfen yasinizi giriniz: ");
		 int yas = scan.nextInt();
		 System.out.println("Lutfen kilonuzu giriniz: ");
		 double kilo = scan.nextDouble();
		 System.out.println("Lutfen boyunuzu giriniz: ");
		 double boy = scan.nextDouble();
		 System.out.println("Lutfen devam etmek istediginiz sureyi ay olarak giriniz: ");
		 double abonelikSuresi = scan.nextDouble();
		 
		 double ucret = abonelikSuresi * 20;
		 
		 System.out.println("*****Kullanici Bilgi Karti*** \nIsim: " + isim 
				 + "\nSoyisim: " + soyisim 
				 + "\nYas: " + yas 
				 + "\nKilo: " + kilo 
				 + "\nBoy: " + boy);
		 
		 System.out.println("Bilgilerine sahip kullanicinin abonelik suresi " + abonelikSuresi + " ay ve abonelik ucreti " + ucret + "$ dir");

		 scan.close();


	    }

}
