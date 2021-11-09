package Day02_IfStatementAndTernaryAndSwitchCase.SwitchCase;

import java.util.Scanner;

public class Q04_100GunSonraGunlerdenNe {
    public static void main(String[] args) {

        // Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi haftanin ilk gunu olarak aliniz..
    	
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Lutfen bugunun hangi gun oldugunu yaziniz: ");
    	String gun = scan.next().toLowerCase();
    	
    	System.out.println("Lutfen kac gun sonrayi ogrenmek istediginizi yaziniz: ");
    	int kacGunSonra = scan.nextInt();
    	
    	int ilerleme = kacGunSonra%7; // burasi 2 oldugu icin her seferinde girilen gunden 2 gun sonrasi olacaktir
    	
    	int kacinciGun = (gun.equals("pazartesi") ? 1 :
				    	  gun.equals("sali" )     ? 2 :
						  gun.equals("carsamba")  ? 3 :
						  gun.equals("persembe")  ? 4 :
						  gun.equals("cuma")      ? 5 :
						  gun.equals("cumartesi") ? 6 :
						  gun.equals("pazar")     ? 7 : 0);
    	
    	kacinciGun = (kacinciGun + ilerleme)%7;
    	
    	switch(kacinciGun) 
    	{
			case 1:
				System.out.println("Pazartesi");
				break;
			case 2:
				System.out.println("Sali");
				break;
			case 3:
				System.out.println("Carsamba");
				break;
			case 4:
				System.out.println("Persembe");
				break;
			case 5:
				System.out.println("Cuma");
				break;
			case 6:
				System.out.println("Cumartesi");
				break;
			case 7:
				System.out.println("Pazar");
				break;
			default:
				System.out.println("Lutfen gecerli bir gun adi giriniz: ");
				break;
    	}
 
    	scan.close();
        
    }
}

