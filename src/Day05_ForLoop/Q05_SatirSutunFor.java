package Day05_ForLoop;

public class Q05_SatirSutunFor {

    public static void main(String[] args) {
// Aşağıdaki şekilde çıktı veren programı print içerisinde
// sadece bir tane # kullanarak yazıdırınız

//            #####
//            #####
//            #####
//            #####
//            #####

       // System.out.println("#####\n#####\n#####\n#####\n#####"); // --> amele isi
    	System.out.println();
       
       for(int satir =1; satir <=5; satir++) 
       {
    	   for(int sutun =1; sutun <=5; sutun++ ) 
    	   {
    		   System.out.print("#");
    	   }
    	   System.out.println();
       }
    }
}
