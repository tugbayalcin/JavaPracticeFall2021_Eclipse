package Day02_IfStatementAndTernaryAndSwitchCase.SwitchCase;

import java.util.Scanner;

public class Q03_AyinKacGunOldugunuYazdirma {
    public static void main(String[] args) {

    	// Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız
    	
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Lutfen bir ay numarasi giriniz (1 ile 12 arasi)");
    	int ay = scan.nextInt();
    	
    	// birinci yol -------------------------------------------------------------------
    	switch (ay) 
    	{
    		case 1:
    			System.out.println("Girilen ay Ocak ayidir. Ve bu ay 31 gundur.");
    			break;
    		case 2: 
    			System.out.println("Girilen ay Subat ayidir. Ve bu ay 28 gundur.");
    			break;
    		case 3: 
    			System.out.println("Girilen ay Mart ayidir. Ve bu ay 31 gundur.");
    			break;
    		case 4: 
    			System.out.println("Girilen ay Nisan ayidir. Ve bu ay 30 gundur.");
    			break;
    		case 5: 
    			System.out.println("Girilen ay Mayis ayidir. Ve bu ay 31 gundur.");
    			break;
    		case 6: 
    			System.out.println("Girilen ay Haziran ayidir. Ve bu ay 30 gundur.");
    			break;
    		case 7: 
    			System.out.println("Girilen ay Temmmuz ayidir. Ve bu ay 31 gundur.");
    			break;
    		case 8: 
    			System.out.println("Girilen ay Agustos ayidir. Ve bu ay 31 gundur.");
    			break;
    		case 9: 
    			System.out.println("Girilen ay Eylul ayidir. Ve bu ay 30 gundur.");
    			break;
    		case 10: 
    			System.out.println("Girilen ay Ekim ayidir. Ve bu ay 31 gundur.");
    			break;
    		case 11: 
    			System.out.println("Girilen ay Kasim ayidir. Ve bu ay 30 gundur.");
    			break;
    		case 12: 
    			System.out.println("Girilen ay Aralik ayidir. Ve bu ay 31 gundur.");
    			break;
    		default:
    			System.out.println("Lutfen gecerli bir ay numarasi giriniz: ");		
    	}
    	
    	// ikinci yol -------------------------------------------------------------------------
    	switch (ay) 
    	{
    		case 1:
    		case 3:
    		case 5:
    		case 7:
    		case 8:
    		case 10:
    		case 12:
    			System.out.println("Girilen ay 31 gundur.");
    			break;
    		case 4:
    		case 6:
    		case 9:
    		case 11:
    			System.out.println("Girilen ay 30 gundur.");
    			break;
    		case 2:
    			System.out.println("Lutfen Yili Giriniz:");
    			int yil = scan.nextInt();
    			if(yil%4==0) 
    			{
    				System.out.println("Girilen Ay 29 Gundur.");
    			}
    			else 
    			{
    				System.out.println("Girilen Ay 28 Gundur.");
    			}
    			break;
    		default:
    			System.out.println("Lutfen gecerli bir ay numarasi giriniz: ");	
    			break;
    	}
    	
    	
    	
    	scan.close();
       
    }
}

