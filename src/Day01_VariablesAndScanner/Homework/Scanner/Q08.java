package Day01_VariablesAndScanner.Homework.Scanner;

import java.util.Scanner;

public class Q08 {
	
	public static void main(String[] args) {
    	/*
    	 * Kullanicidan alacaginiz vize1 vize2 ve final notlarini 
    	 * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
    	 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen ilk vize notunuzu giriniz: ");
		double vize1 = scan.nextDouble();
		System.out.println("Lutfen ikinci vize notunuzu giriniz: ");
		double vize2 = scan.nextDouble();
		System.out.println("Lutfen final notunuzu giriniz: ");
		double  finalNotu= scan.nextDouble();
		
		double vizedenGelenNot = ((vize1+vize2)/2) *30/100;
		double finaldenGelenNot = finalNotu * 70/100;
		double gecmeNotu = (vizedenGelenNot + finaldenGelenNot);
		System.out.println("Gecme Notunuz: " + gecmeNotu);
		
		scan.close();
		

    }

}
