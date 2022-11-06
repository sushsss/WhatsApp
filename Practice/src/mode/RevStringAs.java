package mode;

public class RevStringAs {
	
	public static void main (String [] args) {
		
		String str= "sushant";
		String abc = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			abc= abc +str.charAt(i);
			
		}
		 System.out.print(abc);
	}

}
