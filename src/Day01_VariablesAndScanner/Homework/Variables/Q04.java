package Day01_VariablesAndScanner.Homework.Variables;

public class Q04 {
	
	public static void main(String[] args) {
        System.out.println("-------------------Arttırma");
        int a = 1;
        System.out.println("a : "+(++a)); //2 --> once arttir sonra yazdir diyor, ve artik atama yapildi, a bundan sonra kalici olarak degisti
        System.out.println("a : "+(a++)); //2 --> once yazdir sonra arttir, a bir ust satirdsa 2 olmustu, 2 yazilacak ancak ardindan a ya kalici olarak 3 atanacak
        System.out.println("a : "+a);  //3

        a=5; // atama yapildi, kalici degisiklik oldu
        System.out.println("son hali :"+(a++ + ++a)) ;
        // 5 + 7 = 12


        System.out.println("-------------------Azaltma");
        int b = 5;
        System.out.println(--b);  //4
        System.out.println(b--);  //4
        System.out.println(b);  //3


        System.out.println("-------------SORU1-----------------");
        int x = 20;
        int y = 15;

        System.out.println(++x + --y);  //21 + 14 =35  x= 21   y=14
        System.out.println(x);
        System.out.println(y);

        System.out.println("-----------------------------------");
        System.out.println(++x + y--);  // 22 + 14=36  x=22 y=13
        System.out.println(x);
        System.out.println(y);


        System.out.println("-------------SORU2-----------------");

        x = 20;
        y = 15;

        System.out.println(x++ + y--);  // 20+15=35   x=21 y=14
        System.out.println(x);
        System.out.println(y);

        System.out.println("-----------------------------------");

        System.out.println(x++ + --y);  // 21+13 =34  x=22 y=13
        System.out.println(x);
        System.out.println(y);

        System.out.println("-----------------------------------");



        int k=5;

        int sonuc = ++k + k++ + k++ + --k + k-- + k;
        //  6  + 6 +  7   + 7 + 7 + 6 = 39   k=6

        System.out.println("sonuc = " + sonuc);
        System.out.println("k = " + k);

    }


}
