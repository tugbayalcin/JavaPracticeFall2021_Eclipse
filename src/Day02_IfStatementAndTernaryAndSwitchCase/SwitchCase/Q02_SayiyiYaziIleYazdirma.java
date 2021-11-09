package Day02_IfStatementAndTernaryAndSwitchCase.SwitchCase;

import java.util.Scanner;

public class Q02_SayiyiYaziIleYazdirma {
    public static void main(String[] args) {
    	// 2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız

    	Scanner scan = new Scanner(System.in);
    	System.out.println("Lutfen 3 basamakli bir sayi giriniz: ");
    	int sayi = scan.nextInt();
    	
    	int birlerBasamagi = sayi%10;
    	int onlarBasamagi = (sayi/10)%10;
    	int yuzlerBasamagi = sayi/100;
    	
    	String birler= "";
    	String onlar="";
    	String yuzler="";
    	
    	switch(birlerBasamagi) 
    	{
    	case 0:
    		birler = "";
    		break;
    	case 1:
    		birler = "bir";
    		break;
    	case 2:
    		birler = "iki";
    		break;
    	case 3:
    		birler = "uc";
    		break;
    	case 4:
    		birler = "dort";
    		break;
    	case 5:
    		birler = "bes";
    		break;
    	case 6:
    		birler = "alti";
    		break;
    	case 7:
    		birler = "yedi";
    		break;
    	case 8:
    		birler = "sekiz";
    		break;
    	case 9:
    		birler = "dokuz";
    		break;
    	}
    		
    	
    		
    	switch(onlarBasamagi) 
        {
        case 0:
        	onlar = "";
        	break;
        case 1:
        	onlar = "on";
        	break;
       	case 2:
       		onlar = "yirmi";
       		break;
       	case 3:
       		onlar = "otuz";
       		break;
       	case 4:
       		onlar = "kirk";
       		break;
       	case 5:
       		onlar = "elli";
       		break;
       	case 6:
       		onlar = "atmis";
       		break;
       	case 7:
       		onlar = "yetmis";
       		break;
       	case 8:
       		onlar = "seksen";
       		break;
       	case 9:
       		onlar = "doksan";
       		break;
    		
        }
    	
    	switch(yuzlerBasamagi) 
        {
        case 0:
        	yuzler = "";
        	break;
        case 1:
        	yuzler = "yuz";
        	break;
       	case 2:
       		yuzler = "ikiyuz";
       		break;
       	case 3:
       		yuzler = "ucyuz";
       		break;
       	case 4:
       		yuzler = "dortyuz";
       		break;
       	case 5:
       		yuzler = "besyuz";
       		break;
       	case 6:
       		yuzler = "altıyuz";
       		break;
       	case 7:
       		yuzler = "yediyuz";
       		break;
       	case 8:
       		yuzler = "sekizyuz";
       		break;
       	case 9:
       		yuzler = "dokuzyuz";
       		break;
    		
    	}
    	System.out.println(yuzler+" "+onlar+" "+birler);
    	
    	
    	scan.close();

    }
}
