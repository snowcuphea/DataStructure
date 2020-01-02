package A02_Array;

import java.util.Random;
import java.util.Scanner;

public class Test02ArrayRandom {
	
	static int Maxi(int[] b) {
		int maxi = 0;
		maxi = b[0];
		for(int i=0; i< b.length;i++) {
			if (maxi < b[i]) maxi = b[i];		
		}
		return maxi;
	}
	

	static int[] MakeArray(int num){
		Random rand = new Random();
		int[] arr = new int[num];
		
		for(int i=0; i<num;i++) {
			arr[i] = rand.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("¼öÀÔ·Â : ");
		int num = key.nextInt();
		int[] arr = MakeArray(num);
		int maxi = Maxi(arr);
		
		for(int i=0; i<num;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("maxi:"+maxi);
	}

}
