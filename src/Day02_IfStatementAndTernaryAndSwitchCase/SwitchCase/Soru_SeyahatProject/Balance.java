package Day02_IfStatementAndTernaryAndSwitchCase.SwitchCase.Soru_SeyahatProject;


import static Day02_IfStatementAndTernaryAndSwitchCase.SwitchCase.Soru_SeyahatProject.RunnerClass.*;
//IMPORT STATIC SAYESINDE STATIC VERILERE ClassAdi.StaticDegerAdi olarak degil
//direk degere ismiyle erisebiliyorduk

public class Balance
{
    //MainMenu->1.

    protected static void bakiyeGoruntule()
    {
        Boolean bakiyeMenu=new Boolean(true);
        boolean returnMainMenu=false;
        while(bakiyeMenu)
        {

            System.out.println(duzCizgi+
                    "\nYapmak istediginiz islemi giriniz:\n" +
                    "1.Create Balance\n" +
                    "2.Bakiye Goruntule\n" +
                    "3.Bakiye Guncelle\n" +
                    "0.Ana Menuye geri don!\n"+
                    duzCizgi);


            switch (scan.nextInt())
            {
                case 1:
                    createBalance();
                    break;
                case 2:
                    showBalance();
                    break;
                case 3:
                    updateBalance();
                    break;
                case 0:
                    bakiyeMenu=false;
                    returnMainMenu=true;
                    break;
                default:
                    System.out.println("Lutfen gecerli bir islem seciniz!!!");

            }
        }//while sonu
       
        
        
        if (returnMainMenu)
            displayMainMenu();

    }


    private static void createBalance()
    {
        while(true)
        {
            if (!bakiyeOlustuMu)
            {
                System.out.println("Lutfen Bakiyenizi olusturmak icin miktar giriniz:(Geri donmek icin # giriniz!)");
                String girilenDeger = scan.next();

                try//girilen string deger double a donusuyor mu DENE/TRY
                {
                    bakiye = Double.parseDouble(girilenDeger);//hata alirsam 65'ten 71'e gecerim
                    System.out.printf("Bakiye Olusturuldu -> Toplam Bakiyeniz=%.2f%n", bakiye);//%n alt satira gec demektir
                    bakiyeOlustuMu = true;
                    return;

                }
                catch (Exception e)//girilen deger double'a donusmuyorsa hata aliriz catch/yakala bu hatayi yakalar programin kapanmasini engeller.
                {
                    //double'a donusebilen her hangibir string deger girilmediyse  VE "#" GIRILDIYSE
                    if (girilenDeger.equals("#"))
                        return;//bu methodtan cik
                    else
                        System.out.println("Yanlis deger girildi.");//return; demedim methodtan cikmadim, while loop donmeye devam etti

                }

            }
            else
            {
                System.out.println("Bakiyeniz zaten mevcut, tekrardan olusturamazsiniz");
                return;//methodtan cik
            }
        }

    }
    private static void showBalance()
    {
        if(bakiyeOlustuMu)
            System.out.println("Guncel Bakiyeniz ->"+ bakiye);
        else
            System.out.println("Ilk olarak bakiyenizi olusturunuz!");
    }
    private static void updateBalance()
    {
        if(bakiyeOlustuMu)
        {
            System.out.println("Bakiyenize ekleme/cikarma yapmak icin \"add\\sub\" giriniz:(Geri donmek icin # basiniz!)");
            String option = scan.next();
            double miktar=0;
            if (option.equalsIgnoreCase("add"))
            {
                System.out.println("Ekleme yapmak istediginiz miktari giriniz!");
                miktar=scan.nextInt();
                bakiye+=miktar;
            } else if (option.equalsIgnoreCase("sub"))
            {
                System.out.println("Cikarma yapmak istediginiz miktari giriniz!");
                miktar=scan.nextInt();
                bakiye-=miktar;
            }
            else if(option.equals("#")){
                return;//methodtan cik
            }

            else
                System.out.println("Please type add/sub!");
            System.out.printf("Guncel Bakiyeniz -> %.2f%n",bakiye);
        }
        else
            System.out.println("Ilk olarak bakiyenizi olusturunuz!");


    }
}
