package mode;

public class SortingArrayLogic {

	public static void main(String [] args) {
		int[] a = {1,22,32,33,44,55,53,64,24,64,255,2245,86};
		
		int b;
		for(int i=0; i<a.length;i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]<a[j]) {
					b=a[i];
					a[i]=a[j];
					a[j]=b;
				}
			}
		}
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		}
}
