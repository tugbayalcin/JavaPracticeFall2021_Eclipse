package Day03_StringManupulation;

public class denemeeee {

	public static void main(String[] args) {
	
		 String ss= "Her ders Java gibi olsa";
		
		//System.out.println(ss.substring(22)); //a: length()-1 -> son karakter
       // System.out.println(ss.substring(23));
       // System.out.println(ss.substring(24));
       System.out.println(ss.substring(0, ss.length()));
       //System.out.println(ss.substring(0, 24));
       System.out.println(ss.length());
       System.out.println(ss.substring(ss.length()));
       
       System.out.println(ss.replaceAll("\\w", "*"));
       System.out.println(ss.replaceAll("\\w", "*") + ss.substring(10));
       
       System.out.println(ss.contains("a"));

	}

}
 