package Day03_StringManupulation;

import java.util.Scanner;

public class Q07_UniqueHarfliIsim {
    public static void main(String[] args) {

        /*
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */


        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir isim giriniz :");
        String isim = scan.next();

        //if ile
        System.out.println("   ***   if statement   ***   ");
        String s1=isim.substring(0,1); // veya char c1=isim.charAt(0);  --> ismin ilk harfini verir
        String s2=isim.substring(1,2); // veya char c2=isim.charAt(1);  --> ismin ikinci harfini verir
        String s3=isim.substring(2,3); // veya char c3=isim.charAt(2);  --> ismin ucuncu harfini verir
        // 3 harften daha kisa bir isim girersen hata alirsin cunku   String s3=isim.substring(2,3); satiri calisamaz
        // bound of exeption hatasi aliriz
        // ancak 3'ten daha afzla karakterli bir isim girersen if kosulumuz calisir ve girilen isim 3 harfli degil yazdirir
        if (isim.length() == 3) {
            if (!s1.equals(s2)  && !s1.equals(s3) && !s2.equals(s3)) {
                System.out.println("Girdiginiz isim 3 harfli ve unique karakterle sahip");
            }else System.out.println("Girdiginiz isim 3 harfli ancak unique karakterle sahip degil");

        }else System.out.println("Girdiginiz isim 3 harfli değil");
         
        //Ternary ile
        System.out.println("   ***   ternary   ***   ");
        char c1 = isim.charAt(0);
        char c2 = isim.charAt(1);
        char c3 = isim.charAt(2);

        String result = isim.length() == 3 ? 
        		((c1 != c2 & c1 != c3 && c2 != c3) ? 
        				"Girdiginiz isim 3 harfli ve unique karakterle sahip" :
        				"Girdiginiz isim 3 harfli ancak unique karakterle sahip degil "):
        		"Girdiginiz isim 3 harfli değil";

        System.out.println(result);

        scan.close();
    }
}