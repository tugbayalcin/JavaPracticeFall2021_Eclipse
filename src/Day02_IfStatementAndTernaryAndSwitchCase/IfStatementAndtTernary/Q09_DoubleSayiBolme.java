package Day02_IfStatementAndTernaryAndSwitchCase.IfStatementAndtTernary;


public class Q09_DoubleSayiBolme {

    public static void main(String[] args) {

       /*   45 değerinde bir double oluşturun.
            Eğer double 5'e bölününce kalan 0 ise ve double 8'e bölününce kalan 0 ise
            "able to divide by 5 and 8" yazdırınız.

            Eğer double 10'a bölününce kalan 5 ise ve double 9'a bölününce kalan 0 ise
            "able to divide by 9 and divide by 10 reminder is 5" yazdırınız.
        */
    	
    	// ben yaptim 
    	
    	double sayi = 45.0;
    	if((sayi%5 ==0) && (sayi%8 ==0)) 
    	{
    		System.out.println("able to divide by 5 and 8");
    	}
    	else if((sayi%10 ==5) && (sayi%9 ==0)) 
    	{
    		System.out.println("able to divide by 9 and divide by 10 reminder is 5");
    	}

        
    }
}
