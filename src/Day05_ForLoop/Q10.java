package Day05_ForLoop;

import java.util.Scanner;

public class Q10 {
    /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

     */
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       
       System.out.println("Lutfen Bir Harf Giriniz: ");
       String girilenHarf = scan.nextLine();
       String sesliHarfler = "aeiuoAEIOU";
       String sessizHarfler = "bcdfghjklmnprstvyxzwqBCDFGJKLMNPRSTVYZXWQ";
       
     /* if(girilenHarf.length()==1) 
      {
    	  for(int i=0; i<sessizHarfler.length(); i++)  // boyu uzun olana kadar yapiyoruz
          {
       	   if(girilenHarf.charAt(0) == sesliHarfler.charAt(i)) 
       	   {
       		   System.out.println("Girilen Harf Seslidir.");
       		   break;
       	   }
       	   else if(girilenHarf.charAt(0)==sessizHarfler.charAt(i))
       	   {
       		   System.out.println("Girilen Harf Sessizdir.");
       		   break;
       	   }
       	   else 
       	   {
       		   System.out.println("Yanlis Karakter Girdiniz.");
       		   break;
       	   }
          }
      }
     
       */ // ascii ile yap !! hoca yapamadi
     
       
    }
}

