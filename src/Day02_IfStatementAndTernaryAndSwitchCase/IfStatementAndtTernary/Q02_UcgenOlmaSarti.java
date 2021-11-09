package Day02_IfStatementAndTernaryAndSwitchCase.IfStatementAndtTernary;

import java.util.Scanner;

public class Q02_UcgenOlmaSarti {

	public static void main(String[] args) {
	/*
	 *  Kullanicidan 3 tene pozitif  tam sayi alniz. 
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
	     
	     üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan kucuk olmali
		 a+b>c>a-b
		 a+c>b>a-c  
	     b+c>a>b-c  
		a=b=c ise es kenar ucgen 
		 
	 */
		
		// kendim yaptim 
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Lutfen 3 tam sayi giriniz: \n(ilk sayiyi girdikten sonra enter'a basarak diger sayilarin girisini yapiniz) ");
	
	int a= scan.nextInt();
	int b= scan.nextInt();
	int c= scan.nextInt();
	
	if(((a+b)>c && c>(a-b)) && ((a+c)>b && b>(a-c)) && ((b+c)>a && a>(b-c)))
	{
		System.out.println("Girilen sayilar ile bir ucgen olusturulabilir.");
		
		if(a==b && a==c && b==c) 
		{
			System.out.println("Olusan ucgen bir eskenar ucgendir.");
		}
		else if(a==b || a==c || b==c) 
		{
			System.out.println("Olusan ucgen bir ikizkenar ucgendir.");
		}
		else 
		{
			System.out.println("Olusan ucgen bir cesitkenar ucgendir.");
		}
	}
	else 
	{
		System.out.println("Girilen sayilar ile bir ucgen olusturulamaz.");
	}
	
	
	scan.close();
		
	

				

	}

}
