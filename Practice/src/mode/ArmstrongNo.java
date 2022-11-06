package mode;

public class ArmstrongNo {
	public static void main(String args[]) {
		int a = 371;
		int b=a;
		int c;
		int d= 0;
		
		while(b!=0) {
			c=b%10;
			d=d+(c*c*c);
			b=b/10;
		}
		if(a==d) {
			System.out.println("no is armstrong number");
		}else
			System.out.println("no is not armstrong number");
		
	}

}
