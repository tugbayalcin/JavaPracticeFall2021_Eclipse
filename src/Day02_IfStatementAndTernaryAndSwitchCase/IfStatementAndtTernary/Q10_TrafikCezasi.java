package Day02_IfStatementAndTernaryAndSwitchCase.IfStatementAndtTernary;

import java.util.Scanner;

public class Q10_TrafikCezasi {
    public static void main(String[] args) {

        /*
          Problem tanimi : 
        Kulanıcıdan aracının hızını alınız
        Trafik cezasının değerini hesaplayın.
            45 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:
            Ceza 100 $'dır.

            Eğer hızınız 75 - 84 arasında ise:
            Ceza 150 $'dır.

            Eğer hızınız 85 -94 arasında ise:
            Ceza 320 $'dır.

            Eğer hızınız 94'den daha fazla ise:
            Ceza 500 $'dır.

            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------

            Örn;

            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

            sonuç 320 olmalıdır.

            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

            sonuç 300 olmalıdır.
     */
    	// ben yaptim, daha pratik olabilir mi daha sonra bak ve revize et

    	Scanner scan = new Scanner(System.in);
    	System.out.println("Lutfen Aracin Hizini Giriniz: ");
    	int hiz = scan.nextInt();
    	System.out.println("Lutfen Ehliyet Bilgisini Giriniz: \n(Ehliyetiniz varsa 1, yoksa 0 giriniz) ");
    	int ehliyet = scan.nextInt();
    	int ceza = 0;
    	
    	if(ehliyet == 1) 
    	{
    		if(hiz>=55 && hiz<74) 
        	{
        		ceza = 100;
        	}
        	else if(hiz<84) 
        	{
        		ceza = 150;
        	}
        	else if(hiz<94) 
        	{
        		ceza = 320;
        	}
        	else if(hiz>=94) 
        	{
        		ceza = 500;
        	}
    	}
    	else if(ehliyet == 0) 
    	{
    		if(hiz>=55 && hiz<74) 
        	{
        		ceza = 300;
        	}
        	else if(hiz<84) 
        	{
        		ceza = 1350;
        	}
        	else if(hiz<94) 
        	{
        		ceza = 520;
        	}
        	else if(hiz>=94) 
        	{
        		ceza = 700;
        	}
    	}
    	else 
    	{
    		System.out.println("Lutfen Gecerli Bir Deger Giriniz:");
    	}
    	System.out.println("Hiz Sinirini Astiniz. Cezaniz:" + ceza + "$'dir.");
    	
    	
   
    	scan.close();
       

    }
}
