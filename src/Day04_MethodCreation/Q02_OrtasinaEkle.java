package Day04_MethodCreation;

import java.util.Scanner;

public class Q02_OrtasinaEkle {
    public static void main(String[] args) {
		/*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirinan bir method oluşturun
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		         
		         
		*/
    	
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Birinci Ismi Giriniz: ");
    	String name1 = scan.next();
    	
    	System.out.println("Birinci Ismi Giriniz: ");
    	String name2 = scan.next();
    	
    	ortasinaEkle(name1, name2);
   
    	
    	
    	scan.close();
}

	private static void ortasinaEkle(String s1, String s2) {

		if(s1.length()%2==0) 
		{
			System.out.println(s1.substring(0, s1.length()/2)+ s2 +s1.substring(s1.length()/2));
		}
		else 
		{
			System.out.println("Birinci Isim Cift Karaktere Sahip Olmadigi Icin Ortasina Yerlestirilemedi");
		}
		
	}


}
