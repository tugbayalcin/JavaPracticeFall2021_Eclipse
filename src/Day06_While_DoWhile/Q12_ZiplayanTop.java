package Day06_While_DoWhile;

import java.util.Scanner;

public class Q12_ZiplayanTop {
	
	 //Bir top belirli bir yükseklikten atılmaktadır.
    // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do-while blogu create ediniz.

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen topu attiginiz yuksekligi giriniz: ");
		double yukseklik = scan.nextDouble();
		double topunToplamYolu = yukseklik;
		int yereCarpmaSayisi = 0;
		
		do 
		{
			yereCarpmaSayisi ++;
			topunToplamYolu += yukseklik; // top hem iniyor hem cikiyor, o yüzden iki kere yuksekligi topluyoruz
			yukseklik *= (0.75); // double olsun diye 3/4 yerine 0.75 yazdik
			topunToplamYolu += yukseklik;
			
		}
		while(yukseklik >=1);
		
		System.out.println("Topun Yere Carpma Sayisi: " + yereCarpmaSayisi +"\nTopun Aldigi Toplam Yol: " + topunToplamYolu);

		scan.close();
	}

}
