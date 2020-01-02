package A02_Array;

public class Test01ArrayClone {
	static int Maxi(int[] b) {
		int maxi = 0;
		maxi = b[0];
		for(int i=0; i< b.length;i++) {
			if (maxi < b[i]) maxi = b[i];		
		}
		return maxi;
	}

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 7, 6};
		int[] b = new int[5];
			
		b = a.clone();
				
		System.out.println(Maxi(b));
			
			}

}


