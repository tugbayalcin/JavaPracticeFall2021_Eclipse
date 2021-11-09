package Day02_IfStatementAndTernaryAndSwitchCase.IfStatementAndtTernary;

import java.util.Scanner;

public class Q13_DikUcgen {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)

        Örnek Ekran Çıktısı
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.

        Bu bir dik üçgendir
     */

    	// ben yaptim 
    	
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Lutfen 3 tam sayi giriniz: \n(ilk sayiyi girdikten sonra enter'a basarak diger sayilarin girisini yapiniz) ");
    	
    	int a= scan.nextInt();
    	int b= scan.nextInt();
    	int c= scan.nextInt();
    	
    	if(((a*a)+(b*b) == (c*c)) || ((a*a)+(c*c) == (b*b)) || ((b*b)+(c*c) == (a*a)))
    	{
    		System.out.println("Girilen ucgen bir dik ucgendir.");
    	}
    	else 
    	{
    		System.out.println("Girilen ucgen bir dik ucgen degildir.");
    	}
    	scan.close();
       


    }
}
