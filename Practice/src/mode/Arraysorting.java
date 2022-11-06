package mode;

import java.util.Arrays;

public class Arraysorting {
	public static void main(String [] args) {
		int [] a= {12,13,554,64,33,65,34,344,654,345,87,665,86,43,63};
		
		Arrays.sort(a);
		for(int i=a.length-1; i>=0;i--) {
			System.out.println(a[i]);
		}
		
		System.out.println("for assending :");
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

}
