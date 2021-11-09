package Day02_IfStatementAndTernaryAndSwitchCase.IfStatementAndtTernary;

import java.util.Scanner;

public class Ter02 {

    public static void main(String[] args) {
        // Kullanicidan bir character girmesini isteyiniz
        // Character harf ise kucuk harf olup olmadigini kontrol ediniz
        // Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
        // Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
        // Harf degilse ekrana "Harf degil" yazdiriniz
        //97:a  122:z ascii değeri
    	
    	
    	// ben yaptim 
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Lutfen bir harf giriniz: ");
		char harf = scan.next().charAt(0);
		
		String sonuc = ((harf >= 65 && harf <= 90) || (harf >=97 && harf <= 122))?((harf >=97 && harf <= 122)?("Kucuk Harf"):("Buyuk Harf")):("Harf Degil");
    	System.out.println(sonuc);
    	scan.close();

       
    }
}
