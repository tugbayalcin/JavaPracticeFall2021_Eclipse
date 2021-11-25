package Day05_ForLoop;

public class Q02_AsciiYazdir {
    public static void main(String[] args) {


// 0-255 e kadar olan harflerin , sayı ve harf değerini konsola yazdırınız.

        for(int i=0; i<=225; i++) 
        {
        	char harf = (char) i; // i variable'i char'dan buyuk oldugu icin data casting ile char'a atama yaptik
        	System.out.println(i+ "-" + harf);
        	
        	
        }

    }
}


