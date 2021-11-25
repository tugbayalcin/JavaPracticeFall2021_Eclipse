package Day04_MethodCreation;

import java.util.Scanner;

public class Q01_GhostQuestion {

    public static void main(String[] args) {

		/* StringMethods
           String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
           Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin
          ORNEK:
           INPUT      :  goat
                         photo
                         ghost
                         kalem
           OUTPUT :      gat
                         hoto
                         ghost
                         lem
		 */
    	
    	// !!! soruyu anlamiyorsun, cok normal, input ve outputlari inceleyerek coz
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Lutfen Bir Metin Giriniz:");
    	String str = scan.nextLine();
    	
    	System.out.println(ilkIkisiz(str));
    	
       
    	scan.close();
    }

	public static String ilkIkisiz(String s) {
		String yeniKelime = "";
		
		if(s.startsWith("gh")) 
		{
			yeniKelime=s;
		}
		else if(s.startsWith("g")) 
		{
			yeniKelime = s.charAt(0) + s.substring(2);
		}
		else if(s.charAt(1) == 'h') 
		{
			yeniKelime = s.substring(1);
		}
		else 
		{
			yeniKelime = s.substring(2);
		}
		
		return yeniKelime;
	}
}
