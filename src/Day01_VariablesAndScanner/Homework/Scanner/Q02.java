package Day01_VariablesAndScanner.Homework.Scanner;

import java.util.Scanner;

public class Q02 {
	
	public static void main(String[] args) {

		/*
		 * Kullanicidan uc basamakli bir sayi alin 
		 * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
		 * 
		 * 
		 * Ornek : Inputs : 853 
		 * Output : Girdiginiz sayinin birler basamagi : 3
		 *          Girdiginiz sayinin onlar basamagi : 5 
		 *          Girdiginiz sayinin yuzler basamagi : 8
		 * 
		 * 
		 */
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 3 basamakli bir sayi girinşz: ");
		int sayi = scan.nextInt();
		
		int birlerBasamagi = sayi%10;
		int onlarBasamagi = (sayi/10)%10;
		int yuzlerBasamagi = sayi/100;
		
		System.out.println("Girdiginiz Sayinin Birler Basamagi: "+birlerBasamagi +"\n"
		+"Girdiginiz Sayinin Onlar Basamagi: "+onlarBasamagi +"\n" 
		+"Girdiginiz Sayinin Yuzler Basamagi: "+yuzlerBasamagi +"\n");
		
		scan.close();
		
		
	}

}
