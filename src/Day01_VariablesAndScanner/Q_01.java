package Day01_VariablesAndScanner;

import java.util.Scanner;

public class Q_01 {

	public static void main(String[] args) {
		//githubta kodlarimi okurken bir yorum yazmak istedim, yorumum cok guzel oldugu icin localime de kaydetmek istedim.
		System.out.println("Githubimda kodalrimi okurken java kodu ekledim");
		
		// verilen 12345 sayisinin rakam degerlerini yukaridan asagiya dogru yazdiriniz
		// write a java program to break an integer into a sequence of invidual digits
		// hint: use / and %
		// ex: input: 12345
// 		   output: 1 
//				   2
//		   		   3
//		   	  	   4
//				   5
		// COZUM:
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 5 basamakli bir sayi giriniz: ");
		
		int sayi = scan.nextInt();
		int birlerBasamagi = sayi % 10; // birler bbasamagi sayinin 10 ile bolumunden kalan sayidir
		int onlarBasamagi = (sayi/10)%10; // sayimi 10'a bolerek son basamagi attim sonra yeni birler basamagini bulmak icin modulus kullandim
		int yuzlerBasamagi = (sayi/100)%10;
		int binlerBasamagi = (sayi/1000)%10;
		int onbinlerBasamagi = (sayi/10000); // son basamak oldugu icin bir daha modulus yapmaya gerek yok 
		
		System.out.println(onbinlerBasamagi +"\n"+ binlerBasamagi +"\n"+ yuzlerBasamagi +"\n"+ onlarBasamagi +"\n"+ birlerBasamagi);
		scan.close();
		
		
		
		
		
		
	}

}
