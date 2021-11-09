package Day02_IfStatementAndTernaryAndSwitchCase.IfStatementAndtTernary;
import java.util.Scanner;

public class Q16_EnBuyukEnKucukSayi {
/*
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/
    // ben yaptim
	
    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Lutfen 3 tam sayi giriniz: ");
    	int sayi1 = scan.nextInt();
    	int sayi2 = scan.nextInt();
    	int sayi3 = scan.nextInt();
    	
    	
    	if(sayi1>sayi2 && sayi1>sayi3) 
    	{
    		System.out.println("En Buyuk Sayi: " + sayi1);
    		if(sayi2<sayi3) 
    		{
    			System.out.println("En Kucuk Sayi: " + sayi2);
    		}
    		else 
    		{
    			System.out.println("En Kucuk Sayi: " + sayi3);
    		}
    	}
    	else if(sayi2>sayi1 && sayi2>sayi3) 
    	{
    		System.out.println("En Buyuk Sayi: " + sayi2);
    		if(sayi1<sayi3) 
    		{
    			System.out.println("En Kucuk Sayi: " + sayi1);
    		}
    		else 
    		{
    			System.out.println("En Kucuk Sayi: " + sayi3);
    		}
    	}
    	else if(sayi3>sayi1 && sayi3>sayi2) 
    	{
    		System.out.println("En Buyuk Sayi: " + sayi3);
    		if(sayi2<sayi1) 
    		{
    			System.out.println("En Kucuk Sayi: " + sayi2);
    		}
    		else 
    		{
    			System.out.println("En Kucuk Sayi: " + sayi1);
    		}
    	}
    	
    	
    	scan.close();
        
    }
}

