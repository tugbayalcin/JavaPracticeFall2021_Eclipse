package Day06_While_DoWhile;

import java.util.Scanner;

public class Q18_PinSorma {

	public static void main(String[] args) {
		
		//TODO STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yazınız.
		
		Scanner scan = new Scanner(System.in);
		
		
		String systemPin = "Hello Javaloper";
		int girisHakki = 3;
		
		while(true) 
		{
			System.out.println("Lutfen Pin Kodunu Giriniz: ");
			String userPin = scan.nextLine();
			
			if(userPin.equals(systemPin)) 
			{
				System.out.println("Giris Basarili ");
				break;
			}
			else 
			{
				System.out.println("Hatali Giris Yapildi. Lutfen Tekrar Deneyiniz ");
				girisHakki --;
				System.out.println("Kalan Deneme Hakkiniz: " + girisHakki);
				if(girisHakki == 0) 
				{
					System.out.println("Giris Hakkiniz Kalmadi. ");
					break;
				}
			}
			
		}
		
		
		
		
		
		
		

		scan.close();
	}

}
