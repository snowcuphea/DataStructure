package A02_Array;

import java.util.Random;

public class MakeRandomArray {
	
	public int[] MakeArray(int num){
		Random rand = new Random();
		int[] arr = new int[num];
		
		for(int i=0; i<num;i++) {
			arr[i] = rand.nextInt();
		}
		return arr;
	}
	

}
