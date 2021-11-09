package Day01_VariablesAndScanner.Homework.Scanner;

import java.util.Scanner;

public class Q10 {
	
	// Write a Java program to convert temperature from Fahrenheit to Celsius degree.

	// formula
	    
	    // c = (f-32)*5/9



	    public static void main(String[] args) {
	    	
	    	Scanner scan = new Scanner(System.in);
			System.out.println("Lutfen sicakligi fahrenheit cinsinden giriniz: ");
			double fahrenheit = scan.nextDouble();
			
			double celcius = (fahrenheit - 32)*5/9;
			System.out.println("Fahrenheit cinsinden girilen sicakligin celcius degeri: " + celcius);

			scan.close();

	    }

}
