package Day02_IfStatementAndTernaryAndSwitchCase.SwitchCase.Soru_SeyahatProject;
import java.util.Scanner;


import static Day02_IfStatementAndTernaryAndSwitchCase.SwitchCase.Soru_SeyahatProject.Balance.*;
import static Day02_IfStatementAndTernaryAndSwitchCase.SwitchCase.Soru_SeyahatProject.Payment.*;
import static Day02_IfStatementAndTernaryAndSwitchCase.SwitchCase.Soru_SeyahatProject.Route.*;

/*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.

        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro.
        örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro

		todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.
		İşlemlerde direkt bunları cağırabilirsiniz.


        todo İLK OLARAK;

        "Nereye yolculuk etmek istiyorsunuz?
        (Frankfurt : 60 KM
         Köln : 80 KM
        (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.

    	1.	Frankfurt veya Köln olarak bir giriş yapın.
    	(Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.

   		todo    Frankfurt girildiyse,
        örn: girdi= Frankfurt
                    case=FRANKFURT:

	    Rota = Frankfurt yazdırın.
	    Frankfurt km hesabı işlemi yapın.

       son olarak konsolda: Frankfurt 15 Euro yazsın.

       todo  case: KÖLN ise

       "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.

       son olarak konsolda:  Köln   20 Euro  yazsın.

       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.

        case:1  ise
        " 1 kişilik " yazdırın.
        (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)

        case:2 ise
        "2 kişilik " yazdırın
         2 kişi için bilet fiyatını hesaplayın.

        todo  Son olarak yolculugunuzu check edin;

        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.

        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.


         */

public class RunnerClass
{
    static Scanner scan=new Scanner(System.in);
    static boolean mainMenu=true;
    static final String duzCizgi=new String(new char[40]).replace('\u0000', '*');
    static boolean bakiyeOlustuMu=false;
    static double bakiye=0.0d;

    

    public static void main(String[] args)
    {
        displayMainMenu();
    }


    protected static void displayMainMenu() 
    {
        while(mainMenu)
        {
            System.out.println(duzCizgi+
                    "\n   ----------- MAIN MENU -----------\n" +
                    "Yapmak istediginiz islemi giriniz:\n" +
                    "1.Bakiye islemleri\n" +
                    "2.Rotayi olustur\n" +
                    "3.Odemeyi gerceklestir\n" +
                    "0.Systemden cikiniz!\n"+
                    duzCizgi
            );

            String option=scan.next();
            switch(option)
            {
                case "0":
                    systemCikis();break;
                case "1":
                    bakiyeGoruntule();break;
                case "2":
                    rotaOlustur();break;
                case "3":
                    odemeYap();break;
                default:
                    System.out.println("Lutfen gecerli bir islem seciniz!!!");
            }
        }//while loop'un sonu
    }


    private static void systemCikis() 
    {
        System.out.println("Please type \"Yes\" to exit or \"No\" to go on your transaction:");
        
        String doExit=scan.next();
        
        if(doExit.equalsIgnoreCase("yes")) 
        {
            System.out.println("The system ended up successfully!");
            System.exit(1);//Java Compiler terminate edilir kapatilir 
        }
        else if(doExit.equalsIgnoreCase("no"))
            System.out.println("You did not exit the system!\n---------------------------------------\n");
        else
            System.out.println("Please type Yes/No!");//mesasji yazdirir ve ana menuye geri doner , cunku while loop hala false olmadi, calismaya devam edecek
    }


}


