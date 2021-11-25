package Day05_ForLoop;

import java.util.Scanner;

public class Q04_Continue {

    public static void main(String[] args) {
        // Kullanıcıdan 5 adet sayı isteyiniz
        // Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        // bu soruyu continue kullanarak çözünüz.

        
    	Scanner scan = new Scanner(System.in);
    	int toplam =0;
    	
    	for(int i=1; i<=5; i++) 
    	{
    		System.out.println("Lutfen " +i+ "'inci Sayiyi Giriniz: ");
    		int sayi = scan.nextInt();
    
    		if(sayi>5 && sayi<10) 
    		{
    			System.out.println("Girilen Sayi 5 ile 10 arasinda oldugundan Isleme Alinamadi.");
    			continue; // devam et komutu, yazmasa idik 5 ilee 10 arasindaki sayilar da toplanirdi
    		}
    		toplam += sayi;
    	
    	}
    	System.out.println("Girilen Sayilarin Toplami: " + toplam); 
    	
    	scan.close();
    }

}
