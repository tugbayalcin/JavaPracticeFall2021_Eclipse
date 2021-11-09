package Day02_IfStatementAndTernaryAndSwitchCase.IfStatementAndtTernary;

import java.util.Scanner;

public class Q14_DenklemdeKokBulma {  
	/* Günün sorusu: if statement
      katsayıları verilen 2 bilinmeyenli denklemin kökleriniz bulunuz.

        ax^2 + bx + c;

        Çözüm adımları
        kullanıcıdan a,b,c yi okutun.
        Delta = bb - 4ac
        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
        Delta = 0 => 1 tane kök vardır x = -b/2a
        Delta < 0 ise kök yoktur.
   */
    public static void main (String[] args) 
    {
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Lutfen Birinci Sayiyi Giriniz: ");
    	int a = scan.nextInt(); 
    	
    	System.out.println("Lutfen Ikinci Sayiyi Giriniz: ");
    	int b = scan.nextInt(); 
    	
    	System.out.println("Lutfen Ucuncu Sayiyi Giriniz: ");
    	int c = scan.nextInt(); 
    	
    	double delta = (b*b) - (4*a*c);
    	
    	if(delta>0) 
    	{
    		double kok1 = (-b + (Math.sqrt(delta)/(2*a)));
    		double kok2 = (-b - (Math.sqrt(delta)/(2*a)));
    		System.out.println("Iki tane kok vardir. Bu kokler: " + kok1 + " ve " + kok2 + "'dir.");
    		
    	}
    	else if(delta ==0) 
    	{
    		int kok1 = -b/(2*a);
    		System.out.println("Bir tane kok vardir. Bu kok: " + kok1 + "'dir");
    	}
    	else if(delta<0) 
    	{
    		System.out.println("Kok Yoktur");
    	}
    	scan.close();
   
    
    
    
    }
	
  
}
