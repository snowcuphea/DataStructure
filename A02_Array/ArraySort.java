package A02_Array;

public class ArraySort {
	
	public int[] ReverseArray(int[] arr) {
		
		int[] reverse = arr.clone();
		int[] temp = arr.clone();

		for(int i=0; i<reverse.length/2;i++) {
			
			reverse[i] = reverse[reverse.length-(i+1)];
			reverse[reverse.length-(i+1)] = temp[i];
		}
		return reverse;	
	}
	
	public boolean CompareArray(int[] a, int[] b) {
		boolean tf = true;
		if(a.length != b.length) {
			tf = false;
		}else {
			for(int i=0 ;i<a.length;i++) {
				if(a[i] != b[i]) tf = false;
			}
		}
		return tf;
	}

	

}
