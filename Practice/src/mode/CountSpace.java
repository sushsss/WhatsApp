package mode;

public class CountSpace {
	public static void main(String [] args) {
		String sj= "Su sh an t jadh av";
		int count=0;
		for(int i=0; i<sj.length(); i++) {
			char a = sj.charAt(i);
			if (a==' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
