package mode;

public class RemovingSpace {

	public static void main(String [] args) {
		String a ="Au to mat i on";
		String b = a.replaceAll(" ","");
		
		for(int i=b.length()-1; i>=0; i--) {
		System.out.print(b.charAt(i));	
		}
		
	}
}
