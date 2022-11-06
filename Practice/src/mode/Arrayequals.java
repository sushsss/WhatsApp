package mode;

import java.util.Arrays;

public class Arrayequals {

	public static void main(String [] args) {
		int [] a = {12,11,23,334,45};
		int [] b = {33,22,13,433,55};
		int [] c = {33,22,13,433,55};
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(c, b));
		System.out.println(Arrays.equals(a, c));
	}
}
