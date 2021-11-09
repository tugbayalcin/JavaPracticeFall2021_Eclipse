package Day02_IfStatementAndTernaryAndSwitchCase.IfStatementAndtTernary;

import java.util.Scanner;

public class Q06_KoordinatBolgesi {
    public static void main(String[] args) {
        //// Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.
    	
    	// ben yaptim

       
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Lutfen Koordinat Duzleminden Bir Noktanin X Eksenindeki Parametresini Giriniz");
    	int x = scan.nextInt();
    	System.out.println("Lutfen Koordinat Duzleminden Bir Noktanin Y Eksenindeki Parametresini Giriniz");
    	int y = scan.nextInt();
    	
    	if(x==0 && y==0) 
    	{
    		System.out.println("Koordinatlari Girilen Nokta Orijindir.");
    	}
    	else if(x>0 && y>0) 
    	{
    		System.out.println("Koordinatlari Girilen Nokta Birinci Bolgededir.");
    	}
    	else if(x<0 && y>0) 
    	{
    		System.out.println("Koordinatlari Girilen Nokta Ikinci Bolgededir.");
    	}
    	else if(x<0 && y<0) 
    	{
    		System.out.println("Koordinatlari Girilen Nokta Ucuncu Bolgededir.");
    	}
    	else if(x>0 && y<0) 
    	{
    		System.out.println("Koordinatlari Girilen Nokta Dorduncu Bolgededir.");
    	}
    	else 
    	{
    		System.out.println("Lutfen Gecerli Bir Deger Giriniz:");
    	}
    	
    	scan.close();
    }
}
