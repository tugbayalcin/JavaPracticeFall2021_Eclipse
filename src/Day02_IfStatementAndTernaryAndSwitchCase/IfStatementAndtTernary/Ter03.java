package Day02_IfStatementAndTernaryAndSwitchCase.IfStatementAndtTernary;

import java.util.Scanner;

public class Ter03 {

    public static void main(String[] args) {
        // Kullanıcıdan bir pozitif tamsayı girmesini isteyin, o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
        // 3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
        // Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”

      
    	// ben yaptim
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Lutfen pozitif bir tam sayi giriniz:");
    	int sayi = scan.nextInt();
    	
    	String sonuc = (sayi>=100 && sayi<1000)?("Sayi 3 Basamaklidir"):((sayi%2==0)?("3 Basamakli Olmayan Cift Sayi"):("3 Basamakli Olmayan Tek Sayi"));
    	System.out.println(sonuc);
    	
    	scan.close();
    }
}