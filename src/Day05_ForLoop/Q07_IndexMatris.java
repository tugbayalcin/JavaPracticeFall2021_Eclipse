package Day05_ForLoop;

import java.util.Scanner;

public class Q07_IndexMatris {


     /*  Problem Tanımı
            Matrisin boyutunu kullanıcıdan okuyup.
            Sadece diyagonu (köşegeni) 1 olan ve
            diğer elemanları 0 olan bir kare matrisi ekrana bastırın.

           Ekran Çıktısı
            Bir sayı giriniz: 7
            1000000
            0100000
            0010000
            0001000
            0000100
            0000010
            0000001

            Bir sayi giriniz: 5
            10000
            01000
            00100
            00010
            00001
       */

    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Lutfen Matrisin Boyutunu Giriniz: ");
    	int boyut = scan.nextInt();
    	
    	for(int satir=1; satir<=boyut; satir++) 
    	{
    		for(int sutun=1; sutun<=boyut; sutun++) 
    		{
    			if(satir==sutun) 
    			{
    				System.out.print(1 + " ");
    			}
    			else 
    			{
    				System.out.print(0 + " ");
    			}
    		}
    		System.out.println();
    	}
    	
    	
    	
    	
    	scan.close();
        
    }
}
