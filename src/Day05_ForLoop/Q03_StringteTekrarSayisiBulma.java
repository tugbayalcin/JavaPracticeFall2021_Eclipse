package Day05_ForLoop;

import java.util.Scanner;

public class Q03_StringteTekrarSayisiBulma {
    public static void main(String[] args) {

        /*
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın

        Bugün hava oldukca güzel.-> 2
         

         */
    	
    	
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Lutfen Bir Metin Giriniz:");
    	String str = scan.nextLine();
    	
    	int sayac =0;
    	for(int i=0; i<str.length(); i++) 
    	{
    		if(str.toLowerCase().charAt(i)=='a') 
    		{
    			sayac++;
    		}
    		else if(str.charAt(i)=='c') 
    		{
    			break;
    		}
    	}
    	System.out.println(str + "\nCumlesindeki 'a' Harfi Sayisi: " +sayac);
    	
    	
    	
       scan.close(); 
    }

}
