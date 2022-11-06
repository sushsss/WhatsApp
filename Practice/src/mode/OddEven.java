package mode;

public class OddEven {
	public static void main (String [] args) {
	int [] a= {21,33,23,33,44,3,232,334,54,556,665,576};
	for(int i=0; i<a.length;i++) {
		if(a[i]%2==0) {
			System.out.println(a[i]+"this is even number");
		}
		else
			System.out.println(a[i]+"   "+"this no is odd number");
	}
	}
}
